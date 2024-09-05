/*package view;

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

public class login_control{

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
 
 public void newaccbtn(ActionEvent event) throws Exception {
	 Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
 }
 @FXML
 public void sign_up(ActionEvent event) throws Exception{
		 Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
}

*/

package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class login_control {

    @FXML
    private Button loginbtn;

    @FXML
    private Button sign;

    @FXML
    private PasswordField passwordtxt;

    @FXML
    private TextField usertxt;

    @FXML
    void newaccbtn(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("view.fxml");
    }

    @FXML
    void sign_up(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("register.fxml");
    }

}
