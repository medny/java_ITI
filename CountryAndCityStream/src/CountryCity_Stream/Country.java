/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CountryCity_Stream;

/**
 *
 * @author medany
 */
public class Country {
    private String Country;
    private String Code;

    public Country() 
    {
        
    }

    public Country(String Country, String Code) 
    {
        this.Country = Country;
        this.Code = Code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }       
}
