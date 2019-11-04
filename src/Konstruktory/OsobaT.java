/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktory;

public class OsobaT 
{
    private String imie, nazwisko, pesel, miasto, ulica, dom, lokal;
    private int wiek, waga;
    private String [] numeryTelefonow;
    private String[] samochody;
    OsobaT(String imie, String nazwisko)
    {
        this(imie, nazwisko, "");
    }
    OsobaT(String imie, String nazwisko, String pesel)
    {
        this(imie, nazwisko, pesel, "");
    }
    OsobaT(String imie, String nazwisko, String pesel, String miasto)
    {
        this(imie, nazwisko, pesel, miasto, "");
    }
    OsobaT(String imie, String nazwisko, String pesel, String miasto, String ulica)
    {
        this(imie, nazwisko, pesel, miasto, ulica, "");
    }
    OsobaT(String imie, String nazwisko, String pesel, String miasto, String ulica, String dom)
    {
        this(imie, nazwisko, pesel, miasto, ulica, dom, "");
    }
    OsobaT(String imie, String nazwisko, String pesel, String miasto, String ulica, String dom, String lokal)
    {
        this(imie, nazwisko, pesel, miasto, ulica, dom, lokal, 0);
    }
    OsobaT(String imie, String nazwisko, String pesel, String miasto, String ulica, String dom, String lokal, int wiek)
    {
        this(imie, nazwisko, pesel, miasto, ulica, dom, lokal, wiek, 0);
    }

    public OsobaT(String imie, String nazwisko, String pesel, String miasto, String ulica, String dom, String lokal, int wiek, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miasto = miasto;
        this.ulica = ulica;
        this.dom = dom;
        this.lokal = lokal;
        this.wiek = wiek;
        this.waga = waga;
    }
}
