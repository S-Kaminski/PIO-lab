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
public class MainClass 
{

    public static void main(String[] args) 
    {
        OsobaSingleton os1 = OsobaSingleton.getInstance();
        OsobaSingleton os2 = OsobaSingleton.getInstance();
        OsobaSingleton os3 = OsobaSingleton.getInstance();
        System.out.println(os1.getImie());
        System.out.println(os2.getImie());
        System.out.println(os3.getImie());
        os3.setImie("xxx");
        System.out.println(os1.getImie());
        System.out.println(os2.getImie());
        System.out.println(os3.getImie());
        
        System.out.println("Z instancji: " + OsobaSingleton.getInstance().getImie());
        
    }
    
}
