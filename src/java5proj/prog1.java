
package java5proj;

import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=getlettergrade();
		System.out.println("The grade: "+g);
	}
	public static String getlettergrade()
	{
		Scanner obj=new Scanner(System.in);
		int m=0;
		for(int i=1;i<6;i++)
		{
		   System.out.println("Enter the mark"+i+":");
		    m=m+obj.nextInt();
		}
		double avg = m/5.0;
		if((avg>=90)&&(avg<101))
		{
		           return "A";
		}
		else if((avg>=80)&&(avg<90))
		{
		           return "B";
		}
		else if((avg>=70)&&(avg<80))
		{
		           return "C";
		}
		else if((avg>=60)&&(avg<70))
		{
		           return "D";
		}
		else
		{
			return "F";
		}
	}
	;
}
