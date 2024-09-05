package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class View_control {

    @FXML
    private Button connections;

    @FXML
    private Button mes1;

    @FXML
    private Button mes2;

    @FXML
    private Button mes3;

    @FXML
    private Button mes4;

    @FXML
    private TextField search;

    @FXML
    private Button sign_out;

    @FXML
    private Button update;

    @FXML
    private Button view1;

    @FXML
    private Button view2;

    @FXML
    private Button view3;

    @FXML
    private Button view4;


    @FXML
    void connection1(ActionEvent event) throws Exception{
                 connect();
    }

    @FXML
    void message1(ActionEvent event) throws Exception{
    	Main m = new Main();
        m.changeScene("connected.fxml");
    }

    @FXML
    void message2(ActionEvent event)throws Exception {
    	mes1();
    }

    @FXML
    void message3(ActionEvent event) throws Exception{
    	mes1();
    }

    @FXML
    void message4(ActionEvent event) throws Exception{
    	mes1();
    }

    @FXML
    void profile1(ActionEvent event) throws Exception{
    	mes1();
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

    @FXML
    void view1(ActionEvent event) throws Exception{
    	 Main m = new Main();
         m.changeScene("profile.fxml");
    }

    @FXML
    void view2(ActionEvent event) throws Exception{
    	dis1();
    }

    @FXML
    void view3(ActionEvent event) throws Exception{
    	dis1();
    }

    @FXML
    void view4(ActionEvent event) throws Exception{
    dis1();
    }
    private void mes1() throws Exception {
        Main m = new Main();
        m.changeScene("connected.fxml");
     
        }
    private void dis1() throws Exception {
        Main m = new Main();
        m.changeScene("profile.fxml");
        }
    private void connect() throws Exception {
        Main m = new Main();
        m.changeScene("connection_list.fxml");
        }

}
