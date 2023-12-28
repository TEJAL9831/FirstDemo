package LabAssignment;

public class ShiftElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		 int []inputArray= {0,2,6,0,5,3,0,7,0,4};
		 
		 System.out.println("Before Sfifting Elemnt : ");
		 for(int arr:inputArray)
		 {
			 System.out.print(arr +" ");
		 }
		 
		 System.out.println(" ");
		 
         shiftingZeroToLeft(inputArray);
         
         System.out.println("After Sfifting Elemnt : ");
		 for(int result:inputArray)
		 {
			 System.out.print(result +" ");
		 }
         
	}

	private static void shiftingZeroToLeft(int[] inputArray)
	{
		// TODO Auto-generated method stub
		
		for(int i=inputArray.length-1;i>=inputArray.length-1;i--)
		{
			 if(inputArray[i]==0)
			 {
				 int temp=inputArray[i];
				 inputArray[i]=inputArray[i-1];
				 inputArray[i-1]=temp;
			 }
		}
		
	}

}
