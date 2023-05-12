
import java.util.Scanner;
public class Month {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		 
		int day=0;int err=1;
		System.out.println("Enter month:");
		while(err==1)
		{
			String Month = keyboard.nextLine();
			switch (Month) {
				case "January","Jan.","Jan","1":
					day=31;err=0;break;
				case "February","Feb.","Feb","2":
					day=28;err=0;break;
				case "March","Mar.","Mar","3":
					day=31;err=0;break;
				case "April","Apr.","Apr","4":
					day=30;err=0;break;
				case "May","5":
					day=31;err=0;break;
				case "June","Jun","6":
					day=30;err=0;break;
				case "July","Jul","7":
					day=31;err=0;break;
				case "August","Aug.","Aug","8":
					day=31;err=0;break;
				case "September","Sept.","Sept","9":
					day=30;err=0;break;
				case "October","Oct.","Oct","10":
					day=31;err=0;break;
				case "November","Nov.","Nov","11":
					day=30;err=0;break;
				case "December","Dec.","Dec","12":
					day=31;err=0;break;
				default:
					err=1;
				}
		}
		System.out.println("Enter yeah:");
		int Year = keyboard.nextInt();
		if(Year%4==0)
			if(Year%100==0 && Year%400>0);
			else if(day==28)
				day=29;
		System.out.println("Number of days: " + day);
		
		System.exit(0);

	}
}
