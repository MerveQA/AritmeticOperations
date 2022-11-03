package J04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;
        x += x;
        --x;
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x ); //253
        
        int a = 3;
        double d = 4.5;

        d+=a;
        a+=d;
        d-=a;
        a-=d;

        System.out.println(" d = " + ++d ); //-1.5
        System.out.println(" a = " + a-- ); //12
        
        

	}

}
