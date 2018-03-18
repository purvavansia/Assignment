package assignment2;

public class StartEndArray {

	public static void main(String[] args) {
		
		int arr[] = {5, 7, 7, 8, 8, 10};
		int target=8,first=-1,last=-1;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				if(first==-1) {
					first=i;
				}
				last=i;
				
			}
			
		}
		System.out.println("first :"+ first + " last :"+ last);
	}
}
