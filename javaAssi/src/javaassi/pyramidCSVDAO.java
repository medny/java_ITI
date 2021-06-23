/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Medny
 */
public class pyramidCSVDAO {
     //List<l>l;//error
    public pyramidCSVDAO(){             //the constractor
    File file=new File("D:\\ITI\\java\\assi\\pyramids.csv");
    List<String>lines=new ArrayList<>();
   
        try {
            lines=Files.readAllLines(file.toPath());
        } catch (IOException ex) {
            Logger.getLogger(pyramedCSVDOA.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        for(int index=1;index<lines.size();index++)
        {
            String line=lines.get(index);
            String [] fileds=line.split(",");
            for(int filedIndex=0;filedIndex<fileds.length;filedIndex++)
            {
                fileds[filedIndex]=fileds[filedIndex].trim();
            }
            pyramids p=new pyramids(fileds[0],fileds[2],fileds[4],fileds[7]);
            System.out.println(p);
        }
       
        
    
    
    
    
}
}

