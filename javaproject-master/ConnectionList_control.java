package view;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ConnectionList_control {

    @FXML
    private Button connections;

    @FXML
    private Button mes11;

    @FXML
    private Button mes22;

    @FXML
    private Button mes33;

    @FXML
    private Button mes44;

    @FXML
    private Button sign_out;

    @FXML
    private Button update;

   

    @FXML
    void signout(ActionEvent event) throws Exception{
    	Main m = new Main();
        m.changeScene("login.fxml");
    }
    
    @FXML
    void connection1(ActionEvent event) throws Exception{
        Main m = new Main();
        m.changeScene("connection_list.fxml");
        }

    @FXML
    void update(ActionEvent event) throws Exception{
    	Main m = new Main();
        m.changeScene("register.fxml");
    }

}
