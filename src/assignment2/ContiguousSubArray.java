package assignment2;

public class ContiguousSubArray {

	
		
	public static void main(String[] args) {
		
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		//int arr[]= {-1,2,3,-4,4,2};
		int max=0, max_sumtillnow= 0,start=0,end=0, s=0;
		//int flag=0,count=0;
		
		for(int i= 0; i < arr.length; i++) {
			 max = max + arr[i];
			 if(max< 0) {
				 max = 0;
				 //count++;
				 s=i+1;
			 }
			
			 else if(max_sumtillnow < max) {
				// flag++;
				 max_sumtillnow= max;
				 end=i;
				 start=s;
				  
			 } 
			  
		}
		//start=((flag+1)-count);
		System.out.println("Max sum of contiguos subarray is:" + max_sumtillnow /*+" "+start+" " +end*/);
		for(int j=start;j<=end;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
