package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla iki adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Girdiginiz iki adet integer degerin farkı  = " +(num1-num2));



    }
}
