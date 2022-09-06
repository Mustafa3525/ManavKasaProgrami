

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       double armutFyt = 2.14 , elmaFyt = 3.67 , domatesFyt = 1.11 , muzFyt = 0.95 , patlicanFyt = 5.0 , armut ,
                elma , domates , muz , patlican , total ;


        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        elma = inp.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        domates = inp.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        patlican = inp.nextDouble();

        total = (armut*armutFyt) + (elma*elmaFyt) + (domates*domatesFyt) + (muz*muzFyt) + (patlican*patlicanFyt) ;

        System.out.print("Toplam Tutar : " + total + " TL");

    }
}

