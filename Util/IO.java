package Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 *
 * @author Hellena
 */
public class IO 
{
    ExtensionFilter fileFilter=new FileChooser.ExtensionFilter("HTML file (.html)", "*.html");
    public IO()
    {
            
    }
 
  public void selectFile()
  {
    Stage stage=new Stage();
    FileChooser fileChooser=new FileChooser();
    fileChooser.setTitle("Add File");
    fileChooser.getExtensionFilters().add(fileFilter);
    ArrayList<String> list=new ArrayList();
    File file=fileChooser.showOpenDialog(stage);
    if(file!=null)
    {
        
        Setup s=new Setup();
       
                list=s.folderScanner();
                
                addFile(file.getAbsolutePath());
     }
  }
  
  public void addFile(String filePath) 
  {
     
      File newFile=new File(filePath);
          
  }
}
