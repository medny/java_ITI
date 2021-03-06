/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map_country;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import sun.applet.Main;
/**
 *
 * @author Vista
 */
public class Map_Country {
public List <City> readcityFromCSV()
    {       
        // Intialize an empty list
        List <City> Cities_List = new ArrayList<>();
        
        try
        {
            // Read the CSV File
            File file = new File("E:\\cities.csv");
            Scanner sc = new Scanner(file);
            
            // Skip the Header Line
            sc.nextLine();
            
            // Loop Each line as long as new line exist
            while (sc.hasNextLine())
            {
                // Read New Line and split with the delimeter ","
                String data = sc.nextLine();
                String[] attributes = data.split(",",-1);
                
                for(int i = 0; i < attributes.length; i++)
                {
                    if(attributes[i].isEmpty())
                    {
                        attributes[i] = "";
                    }
                }
                
                // Create a New City Object
                String code = attributes[0];
                String name = attributes[1];
                String country_ID = attributes[2];
                String capital = attributes[3];
                String population = attributes[4];
                City New_City = new City(code, name, country_ID, capital, population);
                
                // Add the new City to the City list
                Cities_List.add(New_City);                             
            }
            
            // Close the file after finishing
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found" + e);
        }
      
        return Cities_List;
    }
    
    public List <Country> readcountryFromCSV()
    {       
        // Intialize an empty list
        List <Country> Countries_List = new ArrayList<>();
        
        try
        {
            // Read the CSV File
            File file = new File("E:\\countries.csv");
            Scanner sc = new Scanner(file);
            
            // Skip the Header Line
            sc.nextLine();
            
            // Loop Each line as long as new line exist
            while (sc.hasNextLine())
            {
                // Read New Line and split with the delimeter ","
                String data = sc.nextLine();
                String[] attributes = data.split(",");
                                
                for(int i = 0; i < attributes.length; i++)
                {
                    if(attributes[i].isEmpty())
                    {
                        attributes[i] = "";
                    }
                }
                
                // Create a New City Object
                String code = attributes[1];
                String name = attributes[0];
                Country New_Country = new Country(name,code);
                
                // Add the new City to the City list
                if (!Countries_List.contains(code))
                {
                    Countries_List.add(New_Country);                           
                }
            }
            
            // Close the file after finishing
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found" + e);
        }
      
        return Countries_List;
    }
    
    public static void main(String[] args) 
    {
 
        try
        {
            Map_Country run = new Map_Country();
            List <City> Cities = new ArrayList<>();
            List <Country> Countries = new ArrayList<>();
            
            // Read the files
            String Cities_Path = "?????????";
            Cities = run.readcityFromCSV();
            
            String Countries_Path = "?????????";
            Countries = run.readcountryFromCSV();
                                
            Map <String, List<City>> Relation = new HashMap<>();
            
            for (Country C1 : Countries)
            {
                List <City> CityLists = new ArrayList<>();
                for (City C2 : Cities)
                {
                    if (C1.getCode().equals(C2.getCountryID()))
                    {
                        CityLists.add(C2);
                    }
                }
                CityLists.sort(Comparator.comparing(City::getPopulation));
               
                Relation.put(C1.getCode(), CityLists);              
                Relation.forEach((k, v) -> System.out.println("Country=" + k + ", Cities=" + v.toString()));
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("File Not Found" + e);
        }
    }    
}
