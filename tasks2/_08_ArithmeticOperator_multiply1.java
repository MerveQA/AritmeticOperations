package J04_AritmeticOperators.tasks2;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

      double d1 = 12.34;
      double d2 = 13.21;
      double d3 = 9.8;

      int sonuc = (int) (d1*d2*d3);
        System.out.println("Degerlerin carpimi : "+sonuc);

    }
}
