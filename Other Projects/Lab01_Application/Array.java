package six_point_five;
import java.util.Arrays;

public class Array {
	public static void main(String[] args)
	{
		int a[] = {2,3,7,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		System.out.println("Sum is:" + sum);
		System.out.println("Average is:" + sum/a.length);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
