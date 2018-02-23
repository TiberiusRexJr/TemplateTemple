package Templetus;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import GUI.MainG;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {

        MainG main=new MainG();
 
        Scene scene = new Scene(main, 500, 500);
        
        primaryStage.setTitle("Templetus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
