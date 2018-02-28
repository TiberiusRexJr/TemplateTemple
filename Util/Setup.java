/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Hellena
 */
public class Setup
{
    private int status=0;
    private final String mainFolder="C://TemplateTemple";
    private final String formsFolder=mainFolder+"/Forms";
    private final String LoginFolder=mainFolder+"/Logins";
    private Vector<String> subFolders=new Vector();
    
    public int mkdir()
    {  
        File dir=new File(mainFolder);    
        if(!dir.exists())
        {
            new File(mainFolder).mkdirs();
            new File(formsFolder).mkdirs();
        File al= new File(mainFolder+"/access_list.txt");
        try
        {
         al.createNewFile();
         BufferedWriter writer=new BufferedWriter(new FileWriter(al));
         writer.write("admin");
         writer.newLine();
         writer.write("password");
         writer.close();
         status=1;

        }
        catch(IOException ex)
        {
            System.out.println(ex.getClass());
        }
       
        }
        return status;
    };
    
    public int mkSub(String[] folders)
    { 
        for(String fol: folders)
        {
            status=1;
        File f=new File(formsFolder);
        File[] paths=f.listFiles();
        new File(formsFolder+"/"+fol).mkdirs();
        
        File file=new File(formsFolder+"/"+fol);
        if(!(file.exists()))
        {
            status=0;
        }
      
        }
        
          return status;
    }
}
