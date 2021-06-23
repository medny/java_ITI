/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyrimids_mean_midean;

/**
 *
 * @author Vista
 */
public class pryamids {
    
   private String pharaoh,modern_name,site;
   private double hight;
    public pryamids( String pharaoh,String modern_name,String site,double hight)
    {
        this.pharaoh=pharaoh;
        this.modern_name=modern_name;
        this.site=site;
        this.hight=hight;
    }
    public pryamids(double hight)
    {
        this.hight=hight;
    }
    
    public double getHight()
    {
        return hight;
    }
     public String getModern_name()
    {
        return modern_name ;
    }
      public String getPharaoh()
    {
        return pharaoh ;
    }
         public String getSite()
    {
        return site ;
    }
    public void setHight(double hight)
    {
        this.hight=hight;
    }
        public void setModer_name(String modern_name)
    {
        this.modern_name=modern_name;
    }
            public void setSite(String site)
    {
        this.site=site;
    }
   public void setParaoh(String pharaoh)
    {
        this.pharaoh=pharaoh;
    }
   @Override
   public String toString()
{
    return "Name: "+pharaoh+"\n The mondern name is :"+modern_name+"\n The site is :"+
            site+"\n The hight is "+hight+"\n------------------------------------------------------------------\n";
}
    
}

