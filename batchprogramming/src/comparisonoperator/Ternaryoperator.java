package comparisonoperator;
import java.util.*;
public class Ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark");
		int mark=sc.nextInt();
		String result=(mark>=40)?"you are pass":"you are fail";
		System.out.println(result);

	}

}
