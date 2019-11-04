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
public class MainClass 
{
    public static void main(String[] args) 
    {
        OsobaT osoba = new OsobaT("Marek", "Janusz", "11328603981", "AAAAAAAAAdres");
        OsobaT osoba1 = new OsobaT("Marek", "Janusz", "11328603981", "AAAAAAAAAdres", "Kolejne");
        Osoba2 osoba2 = new Osoba2();
        osoba2.setImie("Rafał");
        osoba2.setNazwisko("Rafalski");
        System.out.println(osoba2.getImie());
        System.out.println(osoba2.getNazwisko());
        System.out.println(" 123");
        
        OsobaB oBuilder = 
                new OsobaB.OsobaBuilder("Stefan", "Wons", "1337")
                .miasto("Katopato")
                .build();
        
    }
    
}
