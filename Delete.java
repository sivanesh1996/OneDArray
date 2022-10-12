package oneDArray;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5};
		int arr1[]=new int[arr.length-1];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position of element to delete:");
		int d=sc.nextInt();
		int j=0;
		for(int i=0;i<arr1.length;i++) //d=4;
		{
			if(i!=d)
			arr1[i]=arr[j++];
		}

		System.out.println();
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] +" ");
		}
	}

}
