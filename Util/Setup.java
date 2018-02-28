/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


/**
 *
 * @author Hellena
 */
public class Setup
{
    private final String mainFolder="C://TemplateTemple";
    private final String templateFolder=mainFolder+"/Templates";
    private String defaultFolders[]=new String[4];
    private Vector<String> userFolders=new Vector();

    public Setup()
    {
        setDefaultFolder();
    }
    
    public void setUserFolders(String name) 
    {
        this.userFolders.add(name);
    }
    
    public void setDefaultFolder()
    {
        defaultFolders[0]="Forms";
        defaultFolders[1]="Login";
        defaultFolders[2]="Registration";
        defaultFolders[3]="Comments";
    }
         
    public int mkdir()
    {  
        File dir=new File(mainFolder);
        int status=0;
        if(!dir.exists())
        {
            status=1;
            new File(mainFolder).mkdirs();
            new File(templateFolder).mkdirs();
            
            for(String f:defaultFolders)
            {
               new File(templateFolder+"/"+f).mkdir();
            }
        }
        return status;
    };
    
    public int mkSub(String name)
    { 
        int status=0;
       File f=new File(templateFolder);
       File[] flist=f.listFiles();
       List<File> folderList=new ArrayList<>(Arrays.asList(flist));
       
       return status;
       
       
        
    }
}
