import.java.util.*;
class Array1{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);

	int[] arr=new int[10];
	
	System.out.println("Enter Elements Of array");
	int i=0;
	for(i=0;i<10;i++){
		arr[i]=s.nextInt[];
	}
	System.out.println("Enter Number which u want to conform :")
	int num=s.nextInt[];
	int a=0;
	for(int j=0;j<=i;j++){
		if(arr[j]==num){
			System.out.println("Element found at :"+j);
			a=1;
			break;
		}
	}
	if(a==0){
		System.out.println("Element not found");
	}
}
}