package classwork;

public class Findsecondmaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {12,45,67,23,54};
		int temp,size;
		size=array.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
		System.out.println("second max number is:"+array[size-2]);
		
	}

}
