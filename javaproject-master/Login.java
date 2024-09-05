package application;

import java.io.IOException;
import java.util.*;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;



public class Login implements Initializable{

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 @FXML
 private Button loginbtn;

 @FXML
 private Button newaccbtn;

 @FXML
 private PasswordField passwordtxt;

 @FXML
 private TextField usertxt;
 
 @FXML
 private Label lblerrors;

 
 public void loginbtn(MouseEvent event) {
	 if(event.getSource() == loginbtn ) {
		logIn(); 
	 }
 }
 
 public void newaccbtn(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 public void initialize(URL url,ResourceBundle rb) {
	 if (con == null) {
		 setLblError(Color.TOMATO, "Server Error");
     } else {
    	 setLblError(Color.TOMATO, "Server is up : good to go");
     }
 }
	 
 public Login() {
	 con = databaseController.conDB();
 }
	 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 ResultSet resultSet =  null;
 
 private String logIn(){
	 String status = "Success";
	 String usn = usertxt.getText();
	 String password = passwordtxt.getText();
	 /*if(usn.isEmpty() || password.isEmpty())
         setLblErrors(Color.TOMATO, "Empty credentials");
         status = "Error";*/
	 //query
	 if(usn.isEmpty() || password.isEmpty()) {
		 setLblError(Color.TOMATO, "Empty credentials");
         status = "Error";
     } 
	 else {
		 String sql = "SELECT usn,password FROM users where usn = ? and password = ?";
				 try {
					 preparedStatement = con.prepareStatement(sql);
						preparedStatement.setString(1,usn);
						preparedStatement.setString(2, password);
						resultSet = preparedStatement.executeQuery();
						if(!resultSet.next()) {
							setLblError(Color.TOMATO, "Enter Correct USN/Password");
		                    status = "Error";
						}
						else {
							 setLblError(Color.GREEN, "Login Successful..Redirecting..");
	 }
				 }catch(SQLException ex){
					  System.err.println(ex.getMessage());
				      status = "Exception";
				 }
	 }
	 return status;
 }
 private void setLblError(Color color, String text) {
     
     lblerrors.setText(text);
     lblerrors.setTextFill(color);
     System.out.println(text);
 }
 
	 }


	
