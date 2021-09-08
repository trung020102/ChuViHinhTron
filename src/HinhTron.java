import java.util.Scanner;


public class HinhTron {
	public static final float SO_PI = 3.14f;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap ban kinh hinh tron: ");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		System.out.println("Chu Vi hinh tron la: " + 2 * x * SO_PI );

	}

}
