package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Register implements Initializable {

	    @FXML
	    private ComboBox depttxt;

	    @FXML
	    private TextField emailtxt;

	    @FXML
	    private TextField gittxt;

	    @FXML
	    private TextField nametxt;

	    @FXML
	    private TextField outtext;

	    @FXML
	    private TextField passwordtxt;

	    @FXML
	    private TextField projecttxt;

	    @FXML
	    private ComboBox semtext;

	    @FXML
	    private TextField skillstxt;

	    @FXML
	    private TextField usntxt;
	    
	 /*  public void registerbtn(ActionEvent event) {
	    	DatabaseConnection connectNow = new DatabaseConnection();
	    	Connection connectDB = connectNow.getConnection();
	    	String connectQuery = "SELECT Username FROM UserAccount"
	    }
	    try {
	    	Statement statement = connectDB.createStatement();
	    	ResultSet QueryOutput = statement.executeQuery(connectQuery);
	    	while (queryOutput.next()) {
	    		showUsernameLabe.setText(queryOutput.getString(columnLabel:"username"))
	    	}
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }*/
	    
	         @Override
	    public void initialize(URL url, ResourceBundle rb) {
	    	semtext.getItems().add("1");
	    	semtext.getItems().addAll("2","3","4","5","6","7","8");
	    	semtext.setVisibleRowCount(8);
	    	//semtext.setEditable(true);
	    	semtext.setPromptText("Semester");
	    	depttxt.getItems().add("CSE");
	    	depttxt.getItems().addAll("ISE","EEE","ECE","ME","CV","AE","AIDS","AIML");
	    	depttxt.setVisibleRowCount(9);
	    	//semtext.setEditable(true);
	    	depttxt.setPromptText("Department");
	        // combolabel.setText("Semester");    
	    }
}
    
    
   