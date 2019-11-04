/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonP;

/**
 *
 * @author User
 */
public class OsobaSingleton 
{
    private static OsobaSingleton instance;
    private String imie = "";
    private String nazwisko = "";
    private String pesel = "";
    
 private OsobaSingleton(){}
 
 public static OsobaSingleton getInstance()
 {
     if(instance==null)
     {
         instance = new OsobaSingleton();
         instance.imie = "SingletonImieDefault";
         instance.nazwisko = "SingletonNazwiskoDefault";
         instance.pesel = "SingletonPeselDefault";
     }
     return instance;
 }     
}
