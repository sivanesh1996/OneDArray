package oneDArray;

public class Insert {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,6};
		int[] arr1=new int[arr.length+1];
		
		for(int i=0;i<2;i++) {
			arr1[i]=arr[i];
		}
		arr1[2]=3;
		
		for(int i=3;i<arr1.length;i++)
		{
			arr1[i]=arr[i-1];
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] +" ");
		}

	}

}


// Another methods 

private void Array_Modify_inserct() {
		String ls[]= {"ab","df","fg"};
		String ls1[] = new String [ls.length+1];
		System.out.print("Enter a Values : ");
		String s=sc.next();
		System.out.print("Enter a index : ");
		int index = sc.nextInt();
		index =index-1;
		int j=0;
		for(int i=0;i<ls1.length ;i++) {
			if(i==index) {
				ls1[i]=s;
			}else 
				ls1[i]=ls[j++];
		}
		
		
		for(int i=0;i<ls1.length;i++) {
			System.out.println(ls1[i]);
		}
		
		Array_Modify_inserct();
	}
