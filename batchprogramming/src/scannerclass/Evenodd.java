package scannerclass;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		Evenodd obj=new Evenodd();
		obj.findevenodd(number);

	}
	public void findevenodd(int no)
	{
		if(no%2==0)
		{
			System.out.println(no+"is even number");
		}
		else
		{
			System.out.println(no+"is odd number");
		}
	}

}
