package application;
import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.stage.Stage;

	import java.io.IOException;
	import javafx.application.Application;
	import javafx.stage.Stage;
	//import javafx.stage.StageStyle;
	import javafx.scene.Scene;
	import javafx.scene.Parent;
	import javafx.scene.*;
	import javafx.fxml.*;
	import java.io.*;
public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	    //private static Stage stg;

	    @Override
	public void start(Stage primaryStage) throws Exception{
	    	try {
	    		
	    		Parent rootContainer = FXMLLoader.load(getClass().getResource("/application/logi.fxml"));
                Scene s = new Scene(rootContainer);
                 primaryStage.setScene(s);
                 primaryStage.show();
	    	}catch(IOException e) {
	    		//e.printStackTrace();
	    	}
	    }
}

	   