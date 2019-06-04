
package java5proj;
import java.util.*;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner obj=new Scanner(System.in);
		double price=0.0;
		System.out.println("Enter the price");
		price=obj.nextDouble();
		calctax(price);
		}
	/*func that calculate the tax
	 * func takes 1 param :price
	 * func o/p the total tax on the price
	 * o/p to console
	 */
	public static void calctax(double p)
	{
		final double TAXRATE=0.13;
		double res=p*TAXRATE;
		System.out.println("TAX :"+res);
	}
	
	
}
