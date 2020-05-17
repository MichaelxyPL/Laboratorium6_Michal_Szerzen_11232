
package MichalSzerzen11232;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test2 {
    public static void main(String[] args){
    List<Mezczyzna> osoby = new ArrayList<>();

    osoby.add(new Mezczyzna("Andrzej", "Tomaszewski"));
    osoby.add(new Mezczyzna("Rafal", "Andrzejewski"));
    osoby.add(new Mezczyzna("Andrzej", "Andrzejewski"));

    
    

    Collections.sort(osoby); //ta komenda powinna sortować ale niestety wypisane wartości są niezmienione

    
    for(Mezczyzna z: osoby)
    {
        System.out.println(z);
    }




    

    }
}
