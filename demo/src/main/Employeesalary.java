package classwork;
import java.util.*;
public class Employeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee salary");
		int sal=sc.nextInt();
		salary(sal);

	}
	public static void salary(int s)
	{
		double da=s*0.12;
		double hra=s*0.13;
		double pf=s*0.15;
		double grosssal=da+hra+pf+s;
		System.out.println("Employee gross salary is :"+grosssal);
	}

}
