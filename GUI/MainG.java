/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Dream
 */
public class MainG extends BorderPane
{
    Controls con=new Controls();
    MainPanel main=new MainPanel();
    public  MainG()
    {
        this.setLeft(con);
        this.setCenter(main);
       
    }

   
  
}
