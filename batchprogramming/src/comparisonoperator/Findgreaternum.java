package comparisonoperator;
import java.util.*;
public class Findgreaternum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int number1=sc.nextInt();
		System.out.println("enter number2");
		int number2=sc.nextInt();
		String result=(number1>number2)?number1+"is greater":number2+"is greater";
		System.out.println(result);

	}

}
