package J04_AritmeticOperators;

public class task {
    public static void main(String[] args) {

        // TASK ->

        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;


        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);
    }
}
