package comparisonoperator;
import java.util.*;
public class Findgreaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first angle:");
		int a=sc.nextInt();
		//System.out.println("Enter Scond angle:");
		//int b=sc.nextInt();
		//System.out.println("Enter Third angle:");
		//int c=sc.nextInt();
		if(a==90)
		{
			System.out.println("This is right angle");
		}
		else if(a<90)
		{
			System.out.println("This is acute angle");
		}
		else if(a>90)
		{
			System.out.println("This is obtus angle");
		}

	}

}
