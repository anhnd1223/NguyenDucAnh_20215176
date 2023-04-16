package six_point_three;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		
		for (int i = 0;i<a;i++)
		{
			for(int j=a-i;j>0;j--)
			{
				System.out.print(" ");
			}
			//System.out.print("\n");
			for(int j=0;j<i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
}
