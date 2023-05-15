import javax.swing.JOptionPane;
public class ShowTwoNumbers
{
	public static void main(String[] args)
	{
		String strNum1,strNum2;
		String strNoti = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
			"PLease input the first number:","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
		strNoti += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, 
			"PLease input the second number:","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		strNoti += strNum2;

		JOptionPane.showMessageDialog(null,strNoti,"Show two numbers",
			JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}
}
