import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner klavye= new Scanner(System.in);
        System.out.println("tas-kagıt-makas?");
        System.out.println("oyuncu1 : tas için t,kagıt icin k, makas icin m seçiniz?");
        String oyuncu1= klavye.next();
        System.out.println("oyuncu2 : tas için t,kagıt icin k, makas icin m seçiniz?");
        String oyuncu2= klavye.next();
        if (oyuncu1==oyuncu2){
            System.out.println("berabere");}

        else if(oyuncu1.equals("t")  && oyuncu2.equals("m") ){
            System.out.println("oyuncu1 kazandı");}

        else if(oyuncu1.equals("m") && oyuncu2.equals("k")){
            System.out.println("oyuncu1 kazandı");}


        else if(oyuncu1.equals("k") && oyuncu2.equals("t") )
        {System.out.println("oyuncu1 kazandı");}

        else if(oyuncu2.equals("t") && oyuncu1.equals("m"))
        {System.out.println("oyuncu2 kazandı");}

        else if(oyuncu2.equals("k") && oyuncu1.equals("m"))
        {System.out.println("oyuncu1 kazandı");}


        else if(oyuncu2.equals("m") && oyuncu1.equals("k")){
            System.out.println("oyuncu2 kazandı");}

        else if(oyuncu2.equals("k") && oyuncu1.equals("t")){
            System.out.println("oyuncu2 kazandı");
        }
        else{
            System.out.println("yanlış bir değer girdiniz!!!");
        }


    }
}