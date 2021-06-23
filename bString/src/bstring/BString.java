/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bstring;
interface testStr {
    boolean test(String s1,String s2);
}
/**
 *
 * @author Vista
 */
public class BString {
    public static String betterString(String s1,String s2,testStr x ){
        testStr y=x;
        if (y.test(s1,s2))
            return s1;
        else
            return s2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1="abdelrahman";
        String s2="sedky";
        System.out.println(betterString(s1,s2,(ss1,ss2) -> ss1.length()> ss2.length()));
    }
    
}
