package Templetus;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import GUI.MainG;
import Util.Setup;

public class Main extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        Setup st=new Setup();
        MainG main=new MainG();
        
        st.mkdir();
        
        
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
