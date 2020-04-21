package Day4;

public class forLoop {
	
	public static void pyramidAscending(){
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}

	
	 public static void pyramidDescending(){
		int term = 5;
		for(int k=1; k<=term; k++) {
			for(int l=term; l>k; l--) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	 
	 public static void declaringArray(){
		//Declaring an array  
		    int arr[]={12,23,44,56,78};  
		    //Printing array using for-each loop  
		    for(int i:arr){  
		        System.out.println(i);  
		    }  
	 }
	


public static void main(String[] args) {
	pyramidAscending();
	pyramidDescending();
	declaringArray();
}
}