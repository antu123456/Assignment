package comparisonoperator;
import java.util.*;
public class Largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		System.out.println("enter number2");
		int number2=sc.nextInt();
		System.out.println("enter number3");
		int number3=sc.nextInt();
		int result=((number1>number2)?(number1>number3)?number1:number3:(number2>number3)?number2:number3);
		System.out.println(result);


	}

}
