package J04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("3 basamakli bir sayi giriniz : ");
		int sayi = scan.nextInt();

		int ilk = sayi/100;
		int son = sayi%10;
		System.out.println("\"Girdiginiz 3 basamakli sayinin ilk ve son rakamlarinin toplami = " +(ilk+son));


	}

}
