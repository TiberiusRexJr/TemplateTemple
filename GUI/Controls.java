
package GUI;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

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
        this.add(add,0,0);
    }
}
