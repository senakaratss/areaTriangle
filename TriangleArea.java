import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the lenght of the first side of triangle: ");
		int a=kb.nextInt();
		System.out.println("Enter the lenght of the second side of triangle: ");
		int b=kb.nextInt();
		System.out.println("Enter the lenght of the third side of triangle: ");
		int c=kb.nextInt();
		int u=(a+b+c)/2;
		int squareArea= u*(u-a)*(u-b)*(u-c);
		double areaTri=Math.sqrt(squareArea);
		System.out.println("The Triangle Area is: "+areaTri);
		
		
		
		
		
		

	}

}
