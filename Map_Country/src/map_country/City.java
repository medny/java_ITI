/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package map_country;

/**
 *
 * @author Vista
 */
public class City {
    private String code;
    private String name;
    private String country_ID;
    private String capital;
    private String population;

    public City() 
    {
        
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public City(String code, String name, String country_ID, String capital, String population) {
        this.code = code;
        this.name = name;
        this.country_ID = country_ID;
        this.capital = capital;
        this.population = population;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryID() {
        return country_ID;
    }

    public void setCountryID(String Country_ID) {
        this.country_ID = Country_ID;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String Capital) {
        this.capital = Capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
       
}
