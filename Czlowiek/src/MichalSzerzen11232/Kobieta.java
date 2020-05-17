/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MichalSzerzen11232;


public class Kobieta extends Czlowiek {
    
    private String imie, nazwisko;
    
    public Kobieta(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        System.out.println("Stworzono kobiete: "+imie+" "+nazwisko);
    }
    
    @Override
    public String powitanie()
    {
        return "Cześć!";
    }
    
    public String getImie()
    {
        return imie;
    }
    
    public String getNazwisko()
    {
        return nazwisko;
    }

    
    @Override
    public String toString()
    {  
    return "Mezczyzna"+imie+" "+nazwisko;  
    }
}
