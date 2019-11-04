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
    private String imie;
    private String nazwisko;
    private String pesel;

    public static void setInstance(OsobaSingleton instance) {
        OsobaSingleton.instance = instance;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }
    
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
