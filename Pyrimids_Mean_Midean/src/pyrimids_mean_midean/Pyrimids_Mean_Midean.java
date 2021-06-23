/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyrimids_mean_midean;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.toList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
/**
 *
 * @author Vista
 */
public class Pyrimids_Mean_Midean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File file=new File("E:\\pyramids.csv");
          List<String>lines=new ArrayList<>();
          List<pryamids>pList=new ArrayList<>();
          List<Double>list=new ArrayList<>();
          try {
             lines=Files.readAllLines(file.toPath());
        } catch (IOException ex) {
            System.out.println("can not find file to read from it ");
        
        }
          for(int index=1;index<lines.size();index++)
        {
            String line=lines.get(index);
            String [] fileds=line.split(",");
           
            pryamids p=new pryamids(fileds[0],fileds[1],fileds[4],Double.parseDouble(fileds[7]));
            pList.add(p);
            list.add(Double.parseDouble(fileds[7]));
            
        }
        double [] l=new double[list.size()];
         for (int i =0; i < list.size(); i++)
             l[i] = list.get(i);
         
             
           System.out.println("1st Quariter is : "+DoubleStream.of(l).sum()*.25);
           System.out.println("2nd Quariter is : "+DoubleStream.of(l).sum()*.5);
           System.out.println("3rd Quariter is : "+DoubleStream.of(l).sum()*.75);
           
          

    }
    
}
