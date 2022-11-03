package J04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Lutfen saniyeye cevirmek istediginiz saati giriniz : ");
        int saat =s.nextInt();
        System.out.print("Lutfen saniyeye cevirmek istediginiz dakikayi miktarini giriniz : ");
        int dakika = s.nextInt();
        System.out.print("Lutfen eklemek istediginiz saniyeyi giriniz : ");
        int saniye =s.nextInt();

        System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye ---> "+((saat*3600)+(dakika*60)+saniye)+" saniye");



    }

}
