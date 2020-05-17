package MichalSzerzen11232;

import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args){
        

        Scanner in=new Scanner(System.in);
        
        System.out.println("Wybierz kogo tworzysz:\n"
                + "1. Mezczyzna\n"
                + "2. Kobieta");
        
        char w=in.next().charAt(0);
        in.nextLine();
        String imie, nazwisko;
        switch(w)
        {
            case '1':
                
                System.out.println("Podaj jego imie");
                imie=in.nextLine();
                System.out.println("Podaj jego nazwisko");
                nazwisko=in.nextLine();
                Mezczyzna chlopak = new Mezczyzna(imie, nazwisko);
                    
                while(w!='7')
                {
                    System.out.println("Wybierz co chcesz zrobic:\n"
                            + "1. Nadac kolor oczu\n"
                            + "2. Pokazac kolor oczu\n"
                            + "3. Podac wzrost\n"
                            + "4. Zobaczyc wzrost\n"
                            + "5. Podac wiek\n"
                            + "6. Zobaczyc \n"
                            + "7. Zakoncz");
                    w=in.next().charAt(0);
                    in.nextLine();
                    switch(w)
                    {
                        case '1':
                            System.out.println("Podaj kolor oczu");
                            chlopak.setKolorOczu(in.nextLine());
                            break;
                        case '2':
                            System.out.println(chlopak.getImie()+" "+chlopak.getNazwisko()+" ma oczy o kolorze:"+chlopak.getKolorOczu());
                            break;
                        case '3':
                            System.out.println("Podaj wzrost");
                            chlopak.setWzrost(in.nextInt());
                            in.nextLine();
                            break;
                        case '4':
                            System.out.println(chlopak.getImie()+" "+chlopak.getNazwisko()+" ma "+chlopak.getWzrost()+"cm wzorstu");
                            break;
                        case '5':
                            System.out.println("Podaj wiek");
                            chlopak.setWiek(in.nextInt());
                            in.nextLine();
                            break;
                        case '6':
                            System.out.println(chlopak.getImie()+" "+chlopak.getNazwisko()+" ma "+chlopak.getWiek()+" lat");
                            break;
                        case '7':
                            break;
                        default:
                            System.out.println("Wybrano zle");     
                            break;
                    } 
                }
                break;
            
            case '2':
                System.out.println("Podaj jego imie");
                imie=in.nextLine();
                System.out.println("Podaj jego nazwisko");
                nazwisko=in.nextLine();
                Kobieta dziewczyna = new Kobieta(imie, nazwisko);
                
                
                while(w!='7')
                {  
                    System.out.println("Wybierz co chcesz zrobic:\n"
                        + "1. Nadac kolor oczu\n"
                        + "2. Pokazac kolor oczu\n"
                        + "3. Podac wzrost\n"
                        + "4. Zobaczyc wzrost\n"
                        + "5. Podac wiek\n"
                        + "6. Zobaczyc \n"
                        + "7. Zakoncz");
                    w=in.next().charAt(0);
                    in.nextLine();
                
                    switch(w)
                    {
                        case '1':
                            System.out.println("Podaj kolor oczu");
                            dziewczyna.setKolorOczu(in.nextLine());
                            break;
                        case '2':
                            System.out.println(dziewczyna.getImie()+" "+dziewczyna.getNazwisko()+" ma oczy o kolorze:"+dziewczyna.getKolorOczu());
                            break;
                        case '3':
                            System.out.println("Podaj wzrost");
                            dziewczyna.setWzrost(in.nextInt());
                            in.nextLine();
                            break;
                        case '4':
                            System.out.println(dziewczyna.getImie()+" "+dziewczyna.getNazwisko()+" ma "+dziewczyna.getWzrost()+"cm wzorstu");
                            break;
                        case '5':
                            System.out.println("Podaj wiek");
                            dziewczyna.setWiek(in.nextInt());
                            in.nextLine();
                            break;
                        case '6':
                            System.out.println(dziewczyna.getImie()+" "+dziewczyna.getNazwisko()+" ma "+dziewczyna.getWiek()+" lat");
                            break;
                        case '7':
                            break;
                        default:
                            System.out.println("Wybrano zle");     
                            break;
                    }
                }
                break;
            default:
                System.out.println("Wybrano zle");
                break;
        }
        
        
    }

}
