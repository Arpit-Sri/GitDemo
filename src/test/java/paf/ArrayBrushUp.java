package paf;

import java.util.ArrayList;

public class ArrayBrushUp {

	public static void main(String[] args) {
		
		//check the array values who is multiple of 2.
		
		int[] ar= {1,2,6,5,8,7,9,4,6,15,20,63,12};
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] %2==0)
			{
				System.out.println(ar[i]);
			}
			//optional
			else
			{
				System.out.println(ar[i]+"not a multiple of 2");
			}
				
		}
		
		System.out.println("--------------");
		//check if the array has multiple of 2.
		for(int k=0; k<ar.length; k++)
		{
			if(ar[k] %2==0)
			{
				System.out.println("yes Array has the multiple of 2.");
				break;
				
				
			}	
		}
		//enhanced for loop
		for(int x:ar)
		{
			if(x%2==0)
			{
				
				System.out.println(x);
				break;
				
			}
			
		}
		System.out.println("--------------");
		
		String[] ar1= {"I", "am", "not","in","danger"};
		
		for(int j=0; j<ar1.length; j++)
		{
			
			if(ar1[j]=="am")
			{
			System.out.println("yes String is present there");
			
			}
			else
			{
				System.out.println("it is not there");
				
			}
		}
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("My");
		a.add("name");
		a.add("is");
		a.add("bond");
		

				
		

	}

}
