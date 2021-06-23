/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkstring;

/**
 *
 * @author Vista
 */
public class CheckString {
    public static boolean check(String s){
        for (int i=0;i<s.length();i++){
            if (!Character.isLetter(s.charAt(i)))
            {
                return false;
            }      
        } 
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="abdel33rahman432";
        String s2="abdelrahman";
        boolean v = check(s);
        System.out.println(v+" "+s);
        
        v = check(s2);
        System.out.println(v+" "+s2);
    }
    
}
