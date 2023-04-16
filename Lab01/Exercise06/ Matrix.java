package six_point_six;
import java.util.Arrays;

public class Matrix {
	public static void main(String[] args)
	{
		int a[][] = {{2,3,7,4,7},{1,4,5,6,2}};
		int b[][] = {{2,3,5,3,8},{1,4,4,4,9}};
		int c[][] = new int[a.length][a[1].length];
		int i=0;int j=0;
		for(i=0;i<a.length;i++)
			{
			for(j=0;j<a[1].length;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(" " + c[i][j]);
				}
			System.out.print("\n");
			}
	}
}
