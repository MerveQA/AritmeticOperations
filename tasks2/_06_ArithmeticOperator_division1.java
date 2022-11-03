package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sirayla dort adet integer deger giriniz : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Girdiginiz 2 adet integer degerin bolumu = " +(num1/num2));


    }
}
