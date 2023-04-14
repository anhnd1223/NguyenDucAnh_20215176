import javax.swing.JOptionPane;
public class FirstDegree
{
	public static void main(String[] args)
	{
		String strNum1,strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, 
			"Please input the coefficient a:","Input coefficient a:",
			JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);

		strNum2 = JOptionPane.showInputDialog(null, 
			"Please input the coefficient b:","Input coefficient b:",
			JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		double ans;
		if(num1 ==0.0)
			JOptionPane.showMessageDialog(null,
				"Coefficient a = 0","Error",
				JOptionPane.INFORMATION_MESSAGE);
		else 
		{
			ans =-num2/num1;
			JOptionPane.showMessageDialog(null,
				"Answer is: "+ans,"Calculate",
				JOptionPane.INFORMATION_MESSAGE);
		}

		System.exit(0);

	}
}
