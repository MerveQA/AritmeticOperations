package J04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplam {
    public static <Scaner> void main(String[] args) {

        // kullanıcıdan alınan 3 basamaklı bir
        // sayının rakamlaı toplamini create eden code yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println(" 3 basamaklı bir sayı giriniz:");
        int sayi = scan.nextInt();

        int sayi1=sayi/100;  // yuzler basamagı
        int sayi2=sayi%10;   // birler basamagı
        int sayi3=(sayi/10)%10; // onlar basamagı

        System.out.println(sayi1+sayi2+sayi3);


    }
}
