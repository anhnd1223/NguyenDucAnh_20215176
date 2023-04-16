import java.util.Scanner;

public class Math {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//First problem
		System.out.print("Input value a and b:\n");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		if(a==0)
		{
			System.out.print("Variable a=0, can't calculate");
		}
		else
		{
			System.out.print("Solution is:" + -b/a + "\n");
		}
		
		//Second problem
		System.out.print("Input a11,a12,b1,a21,a22 and b2 in that order:\n");
		int a11 = keyboard.nextInt();
		int a12 = keyboard.nextInt();
		int a21 = keyboard.nextInt();
		int a22 = keyboard.nextInt();
		int b1 = keyboard.nextInt();
		int b2 = keyboard.nextInt();
		int D = a11*a22-a21*a12;
		int Dx = b1*a22-b2*a12;
		int Dy = b2*a11-a21*b1;
		if(D==0)
		{
			System.out.print("Determinent D=0, no solution or infinite solutions");
		}
		else
		{
			System.out.println("Solution for x is:" + Dx/D );
			System.out.println("Solution for y is:" + Dy/D );
		}
		
		//Third problem
		System.out.print("Input value a,b and c:\n");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		int c = keyboard.nextInt();
		int delta = b^2-4*a*c;
		if(a==0)
		{
			System.out.print("Variable a=0, can't calculate");
		}
		else if(delta<0)
		{
			System.out.print("Discriminant d=0, no solution");
		}
		else if(delta==0)
		{
			System.out.println("Discriminant d=0, double root");
			int sol = -b/2*a;
			System.out.println("x = y = " + sol);
		}
		else
		{
			System.out.println("Discriminant d>0, 2 solutions");
			double sol = (-b-java.lang.Math.sqrt(delta))/2*a;
			double sol1 = (-b+java.lang.Math.sqrt(delta))/2*a;
			System.out.println("x = " + sol);
			System.out.println("y = " + sol1);
		}
	}
}
