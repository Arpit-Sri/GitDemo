package paf;

public class PrintArray {

	public static void main(String[] args) {
		
		
		//assisgning value to a single variable
		//int x= 9;
		
		//assigning multiple value ti a single variable using Array.
		
		int ar[]={9,5,6,7,9,7,8}; //shortcut way to represtent array
		
		int ar1[]= new int[6];  //different way to represent way an  array
		
		 ar1[0]=5;
		 ar1[1]=4;
		 ar1[2]=2;
		 ar1[3]=6;
		 ar1[4]=7; 
		 ar1[5]=9;
		 
		 
		String[] name={"My","name","is","Bond"};
		
		
		///System.out.println(ar);
		
		//to print all Array together we will use loop here we use "For Loop".
		
		for(int i=0; i<ar.length; i++ ) {
			
			System.out.println(ar[i]);
		}
		
		System.out.println("*************");
		
		for(int j=0;j<ar1.length;j++) {
			
			System.out.println(ar1[j]);
		}
		
		System.out.println("*************");
		
		for(int k=0; k<name.length; k++ ) {
		
		System.out.println(name[k]);
		}
		
		System.out.println("*************");
		
		//printing String Array by using "Enhanced For Loop".
		for(String s:name) {
			
			System.out.println(s);
		}
		
		System.out.println("*************");
		
		for(int fl:ar1) {
			
			System.out.println(fl);
		}
		
		System.out.println("*************");
		//printing only value  who is the multiple of 2.
		int[] ar2 = {1,2,4,20,10,6,7,9,13,31,5,6};
		
		for(int z=0; z<ar2.length; z++) {
			
			if(ar2[z] %2 ==0) 
			{	
				System.out.println(ar2[z]);
			}
			
			else
			{
				System.out.println(ar2[z]);
			}
		}
	}
	

}
