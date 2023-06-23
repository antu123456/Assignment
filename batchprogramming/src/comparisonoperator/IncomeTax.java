package comparisonoperator;
import java.util.*;
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income");
		int income=sc.nextInt();
		if(income<=250000)
		{
			System.out.println("you dont have to pay tax");
		}
		else if(income>250000 && income<500000)
		{
			double tax=income*0.1;
			System.out.println("tax amount is :"+tax);
		}
		else if(income>=500000 && income<1000000)
		{
			double tax=30000+(income*0.2);
			System.out.println("tax amount is :"+tax);
		}
		else if(income>=1000000)
		{
			double tax=50000+(income*0.3);
			System.out.println("tax amount is :"+tax);
		}

	}

}
