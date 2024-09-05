package view;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Connected_control {

    @FXML
    private Button group_chat;

    @FXML
    private Button message;

    @FXML
    void groupchat(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("view.fxml");
    }

    @FXML
    void connection1(ActionEvent event) throws Exception{
   	 Main m = new Main();
        m.changeScene("connection_list.fxml");
}
    
    @FXML
    void message111(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("profile.fxml");
       //  m.changeDimension("profile.fxml",20,20);
    }
    
    @FXML
    void signout(ActionEvent event) throws Exception{
   	 Main m = new Main();
        m.changeScene("login.fxml");
    }
    
    @FXML
    void update(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("register.fxml");
    }

}
