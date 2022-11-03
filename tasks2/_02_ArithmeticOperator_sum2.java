package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla dort adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println("Girdiginiz iki adet integer degerin toplami  = " + (num1+num2+num3+num4));




    }
}
