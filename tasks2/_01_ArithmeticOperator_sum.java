package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla iki adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Girdiginiz iki adet integer degerin toplami  = " + (num1+num2));


    }
}
