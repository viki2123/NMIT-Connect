package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
//import java.io.IOException;

public class Main extends Application {
	 private static Stage stg;
	 
@Override
public void start(Stage myStage) throws Exception{
	stg = myStage;
    myStage.setResizable(false);
Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
myStage.setTitle("NMIT CHAT APPLICATION");
myStage.setScene(new Scene(root,601,462));
myStage.show();
}

public void changeScene(String fxml) throws Exception {
    Parent pane = FXMLLoader.load(getClass().getResource(fxml));
    stg.getScene().setRoot(pane);
}

/*void changeDimension(String fxml,double width,double height) throws Exception{
	//mys=stg;
	double i,j;
	i=height;
	j=width;
	Parent pane = FXMLLoader.load(getClass().getResource(fxml));
	stg.setScene(new Scene(pane,i,j));
}*/

public static void main(String[] args) {
launch(args);
}
}