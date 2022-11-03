package J04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Saat , dakika ve saniye cinsinden yazmak istediginiz saniyeyi giriniz : ");
        int saniye = scan.nextInt();

        int sonSaat = (saniye / 60) / 60;
        int sonDakika = (saniye / 60) % 60;
        int sonSaniye = saniye % 60;

        if (saniye >= 3600) {
            System.out.println(saniye + " ---> " + sonSaat + " saat " + sonDakika + " dakika " + sonSaniye + " saniye");
        } else {
            System.out.println(saniye + " ---> " + sonDakika + " dakika " + sonSaniye + " saniye");
        }


    }
}
