/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassi;

/**
 *
 * @author Medny
 */
public class pyramids {
    private String pharaoh;
    private String modern_name;
    private String site;
    private String hight;
    public pyramids(String pharaoh, String modern_name, String site, String hight)
    {
        this.pharaoh=pharaoh;
        this.modern_name=modern_name;
        this.site=site;
        this.hight=hight;
    }
    public void setpharaoh(String pharaoh){
        this.pharaoh=pharaoh;
    }
    public void setmodern_name(String modern_name){
        this.modern_name=modern_name;
    }
    public void setsite(String site){
        this.site=site;
    }
    public void sethight(String hight){
        this.hight=hight;
    }
    public String getpharaoh(){
        return pharaoh;
    }
    public String getmodern_name(){
        return modern_name;
    }
    public String getsite(){
        return site;
    }
    public String gethight(){
        return hight;
    }
    
    @Override
    public String toString(){
        return "Name: "+pharaoh+"\n ModernName: "+modern_name+"\n Site: "+site+"\n Hight: " +hight+"\n ====================";
    }
    
}
