package dutch_flag_algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays_flag_prog1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter limit ");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("enter values ");
				for(int i=0;i<n;i++)
				{
					a[i]=scan.nextInt();
				}
				
				System.out.println("array 1 ="+ a[1]);
//   List<Integer> al=new ArrayList<>();
//   for(int i=0;i<n;i++)
//	{
//		al.add(a[i]);
//		
//	}
				System.out.println("before sort ");
				for(int c: a)
				{
					System.out.print(c+" ");
				   
				}
				System.out.println();
				
				System.out.println("after sort ");	
Arrays.sort(a);
for(int b: a)
{
	System.out.print(b+" ");
   
}
				
	
	}

}
