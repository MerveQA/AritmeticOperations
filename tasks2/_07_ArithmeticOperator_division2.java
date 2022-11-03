package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla iki adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sonuc = (num1/num2);

        System.out.println("Girdiginiz 2 adet integer degerin bolumu = "+sonuc);




    }
}
