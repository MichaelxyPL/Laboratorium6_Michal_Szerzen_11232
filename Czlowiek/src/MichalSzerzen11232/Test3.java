

package MichalSzerzen11232;



public class Test3 {
    public static void main(String[] args){
    Czlowiek o1= new Czlowiek();
    Czlowiek o2= new Mezczyzna("Mezczyzna", "Mezczyzna");
    Czlowiek o3= new Kobieta("Kobieta", "Kobieta");
    
    System.out.println(o1.powitanie());
    System.out.println(o2.powitanie());
    System.out.println(o3.powitanie());
    }
    
    //Zostały zwrócone oczekiwane powitania. 
    //Myślę, że to z powodu zwracania się do metody klasy głównej, 
    //która jest przeładowywana i kompilator bierze pod uwagę przeładowanie
}
