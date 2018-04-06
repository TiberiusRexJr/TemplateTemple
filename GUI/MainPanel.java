/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Dream
 */
public class MainPanel extends GridPane
{
   
    
    Label add=new Label("Add");
    Label preview=new Label("Preview");
    Label edit=new Label("Edit");
    Label upload=new Label("Upload");
    Label emulator=new Label("Emulator");
    Label organizer=new Label("Organizer");
    
    ArrayList<Label> labels=new ArrayList<>();
  
    MainPanel()
    {
        setDetails();
        addSquare();
        setLabelDetails();
    }
    
    private void setDetails()
    {
        ColumnConstraints cc=new ColumnConstraints();
        this.setAlignment(Pos.TOP_CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25,25,25,25));
        this.setGridLinesVisible(true);
        
        add.setFont(new Font("Arial",30));
        upload.setFont(new Font("Arial",30));
        edit.setFont(new Font("Arial",30));
        emulator.setFont(new Font("Arial",30));
        preview.setFont(new Font("Arial",30));
        organizer.setFont(new Font("Arial",30));
        
       
    }
    
    private void setLabelDetails()
    {
        labels.add(add);
        labels.add(preview);
        labels.add(edit);
        labels.add(emulator);
        labels.add(organizer);
        labels.add(upload);
        
        for(Label a: labels)
        {
            a.setOnMouseEntered((event)->
            {
                a.setScaleX(1.1);
                a.setScaleY((1.1));
                
            });
            a.setOnMouseExited((event)->
        {
            a.setScaleX(1.0);
            a.setScaleY((1.0));
           
        });
            
        }
        
    }
    
    private void createSquare()
    {
        
    }
    private  void addSquare()
    {
      this.add(add,0,0);
      this.add(preview,1,0);
      this.add(edit,2,0);
      this.add(upload,0,1);
      this.add(emulator,1,1);
      this.add(organizer,2,1);
     
    }
}
