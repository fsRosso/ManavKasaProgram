/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

 */

import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,tutar;

        Scanner inp=new Scanner(System.in);

        System.out.println("Armut kaç kilo?");
        double armutKilo=inp.nextDouble();

        System.out.println("Elma kaç kilo?");
        double elmaKilo= inp.nextDouble();

        System.out.println("Domates kaç kilo?");
        double domatesKilo= inp.nextDouble();

        System.out.println("Muz kaç kilo?");
        double muzKilo= inp.nextDouble();

        System.out.println("Patlıcan kaç kilo?");
        double patlicanKilo= inp.nextDouble();

        tutar=((armut*armutKilo)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican));
        System.out.println("Toplam tutar:"+tutar);
    }
}