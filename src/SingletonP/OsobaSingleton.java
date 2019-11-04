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
 public static OsobaSingleton instance()
 {
     if(instance==null)
     {
         instance = new OsobaSingleton();
     }
     return instance;
 }     
}
