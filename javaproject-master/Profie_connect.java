package view;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class Profie_connect {

	    @FXML
	    private Button CHAT1;

	    @FXML
	    private Button DISMISS1;
	    
	    @FXML
	    private Button connections;
	    
	    @FXML
	    private Button sign_out;
	    
	    @FXML
	    private Button update;
	    
	    @FXML
	    void update(ActionEvent event) throws Exception{
	    	 Main m = new Main();
	         m.changeScene("register.fxml");
	    }
	         @FXML
	         void connection1(ActionEvent event) throws Exception{
	        	 Main m = new Main();
	 	        m.changeScene("connection_list.fxml");
    }

	    @FXML
	    void CHAT(ActionEvent event) throws Exception{
	    	 Main m = new Main();
	         m.changeScene("connected.fxml");
	    }
	    
	    @FXML
	    void signout(ActionEvent event) throws Exception{
	    	 Main m = new Main();
	         m.changeScene("login.fxml");
	    }

	    @FXML
	    void DISMISS(ActionEvent event) throws Exception{
	    	 Main m = new Main();
	         m.changeScene("view.fxml");
	    }
	    
	    

	}


