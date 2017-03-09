public class LinearSearch{
	
	public static int searchElement(int[]arr,int element){
		
    for(int i=0;i<arr.length;i++){
			
	if(arr[i]==element){
				
	return i;
	}
	}
	return -1;

	}
	
	public static void main(String [] args){
		
	int arr[] = {1,4,5,65,34,23,54};
	
	System.out.println(LinearSearch.searchElement(arr,54));
	
	}
	
	
	
}