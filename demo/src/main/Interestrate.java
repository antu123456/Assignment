package classwork;
import java.util.*;
public class Interestrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter balance amount in bank:");
		int balance=sc.nextInt();
		System.out.println("Enter deposit amount:");
		int de=sc.nextInt();
		System.out.println("Enter withdrawal amount:");
		int w=sc.nextInt();
		System.out.println("Enter interest rate on bank:");
		int i=sc.nextInt();
		System.out.println("Enter months:");
		int t=sc.nextInt();
		
		Interestrate obj=new Interestrate();
		obj.balance(balance);
		obj.deposite(de, balance);
		obj.withdrawal(w, de, balance);
		obj.rateOfInterest(i, t, w);
		
		
	}
	//int balance,deposit,withdraw,rateofinterest;

	public void balance(int b)
	{
		int balance=25000;
		System.out.println("account balance is:"+balance);
	}
	public void deposite(int d,int b)
	{
		int deposit=b+d;
		System.out.println("amount after deposit:"+deposit);
	}
	public void withdrawal(int w,int deposit,int balance)
	{
		int  withdraw=balance+deposit-w;
		System.out.println("amount after withdrawal:"+withdraw);
	}
	public void rateOfInterest(int r,int t,int withdraw)
	{
		int rateofinterest=(withdraw*r*t)/100;
		System.out.println("rate of interest on amount:"+rateofinterest);
	}

}
