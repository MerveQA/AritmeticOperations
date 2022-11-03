package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla 3 adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        System.out.println("Girdiginiz 3 adet integer degerin toplami  = " + (num1+num2+num3));


    }
}
