/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktory;

/**
 *
 * @author User
 */
public class OsobaB 
{
    String imie="", nazwisko="", pesel="", miasto="";
    
    public static class OsobaBuilder
    {
        String imie, nazwisko, pesel, miasto;

        public OsobaBuilder(String imie, String nazwisko, String pesel) 
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.pesel = pesel;
        }

        public OsobaBuilder imie(String imie) 
        {
            this.imie = imie;
            return this;
        }

        public OsobaBuilder nazwisko(String nazwisko) 
        {
            this.nazwisko = nazwisko;
            return this;
        }

        public OsobaBuilder pesel(String pesel) 
        {
            this.pesel = pesel;
            return this;
        }

        public OsobaBuilder miasto(String miasto) 
        {
            this.miasto = miasto;
            return this;
        }
        public OsobaB build()
        {
            return new OsobaB(this);
        }
        
        
    }
    private OsobaB(OsobaBuilder builder)
    {
        imie = builder.imie;
        nazwisko = builder.nazwisko;
        pesel = builder.pesel;
        miasto = builder.miasto;
    }    
}
