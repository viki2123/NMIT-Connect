package application;

import java.io.IOException;

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

public class Login {

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
 
 public void newaccbtn(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 /*private void setLblError(Color color, String text) {
     lblErrors.setTextFill(color);
     lblErrors.setText(text);
     System.out.println(text);
 }*/
}
	
	