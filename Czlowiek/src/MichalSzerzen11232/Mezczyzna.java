/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MichalSzerzen11232;

import java.util.ArrayList;
import java.util.Collections;


public class Mezczyzna extends Czlowiek implements Comparable<Mezczyzna>{
    
    private String imie, nazwisko;
    
    public Mezczyzna(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        System.out.println("Stworzono mężczyzne: "+imie+" "+nazwisko);
    }
    
    @Override
    public String powitanie()
    {
        return "Siema!";
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

    @Override
    public int compareTo(Mezczyzna o) { //zakładam że każdy ma inne nazwisko
        int result = this.nazwisko.compareTo(nazwisko);
        if (result == 0) 
        {
            result = this.imie.compareTo(imie);
        }
        return result;

    }

}
