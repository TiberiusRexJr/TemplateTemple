
package GUI;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import Util.IO;
public class Controls extends GridPane 
{
    
    Button add=new Button();
    
    protected  Controls()
    {
        setAdd();
        
    }
     
    void setAdd()
    {
        add.setText("Add");
        add.setOnAction((event)->
        {
            IO io=new IO();
            io.addFile();
        });
        this.add(add,0,0);
    }
    
}
