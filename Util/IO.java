package Util;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Hellena
 */
public class IO 
{
    
    public IO()
    {
            
    }
 
  public void addFile()
  {
     Stage stage=new Stage();
     FileChooser fileChooser=new FileChooser();
    fileChooser.setTitle("Add File");
    fileChooser.showOpenDialog(stage);
  }
    
}
