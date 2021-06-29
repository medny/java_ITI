/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountryCity_Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 *@author medany
 */
public class Country_City_Stream {
public List <City> readcityFromCSV(String path)
    {       
       
        List <City> Cities_List = new ArrayList<>();
        
        try
        {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNextLine())
            {
                String data = sc.nextLine();
                String[] attributes = data.split(",",-1);
                
                for(int i = 0; i < attributes.length; i++)
                {
                    if(attributes[i].isEmpty())
                    {
                        attributes[i] = "";
                    }
                }
                String code = attributes[0];
                String name = attributes[1];
                String country_ID = attributes[2];
                String capital = attributes[3];
                String population = attributes[4];
                City New_City = new City(code, name, country_ID, capital, population);
                Cities_List.add(New_City);                             
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found" + e);
        }
      
        return Cities_List;
    }
    
    public List <Country> readcountryFromCSV(String path)
    {       
        List <Country> Countries_List = new ArrayList<>();
        
        try
        {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            sc.nextLine();
            while (sc.hasNextLine())
            {
                
                String data = sc.nextLine();
                String[] attributes = data.split(",");
                                
                for(int i = 0; i < attributes.length; i++)
                {
                    if(attributes[i].isEmpty())
                    {
                        attributes[i] = "";
                    }
                }
                
                String code = attributes[1];
                String name = attributes[0];
                Country New_Country = new Country(name,code);
                
                if (!Countries_List.contains(code))
                {
                    Countries_List.add(New_Country);                           
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found" + e);
        }
      
        return Countries_List;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Country_City_Stream run = new Country_City_Stream();
        List <City> Cities = new ArrayList<>();
        List <Country> Countries = new ArrayList<>();
        String Cities_Path = "E:\\cities.csv";
        Cities = run.readcityFromCSV(Cities_Path);

        String Countries_Path = "E:\\ITI\\Java\\Assiment\\countries.csv";
        Countries = run.readcountryFromCSV(Countries_Path);
        System.out.println("Highest population city of each country");
        for (Country C1 : Countries)
        {
            List <City> PopulationPerCountry = Cities.stream()
                    .filter(c -> C1.getCode().equals(c.getCountryID())).sorted(Comparator.comparing(City::getPopulationValue).reversed())
                    .limit(1)
                    .collect(toList());

            PopulationPerCountry.forEach(C -> System.out.println("Country = " + C.getCountryID() + " ,City=" + C.getName()+ " ,Population = " + C.getPopulation()));   
        }
        System.out.println("Highest 5 population capitals");
        List <City> HighestPopulation = Cities.stream()

                .filter(c -> c.getPopulation() != "")
                    .sorted(Comparator.comparing(City::getPopulationValue).reversed())
                    .limit(5)
                    .collect(toList());
        
        HighestPopulation.forEach(C -> System.out.println("Country = " + C.getCountryID() + " ,City = " + C.getName()+ " ,Population = " + C.getPopulation()));   
    }
    
}
