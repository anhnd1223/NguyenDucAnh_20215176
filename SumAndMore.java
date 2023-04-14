import javax.swing.JOptionPane;
public class SumAndMore
{
	public static void main(String[] args)
	{
		String strNum1,strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, 
			"PLease input the first number:","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
			"PLease input the second number:","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);

		double sum=num1+num2;
		double diff=num1-num2;
		double pro=num1*num2;
		double quo;
		if(num2 ==0)
			quo = 99999;
		else 
			quo=num1/num2;

		JOptionPane.showMessageDialog(null,
			"Sum is: " +sum+ "\nDifference is: "+diff+"\nProduct is: "+pro+"\nQuotient is: "+quo,"Calculate",
			JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}
}