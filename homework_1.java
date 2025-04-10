package method_overloading;

import java.util.*;

public class homework_1 {
	
	public void sum(int a) {
		
		System.out.println("the sum is : " +(a+10));
		
	}
	
	public void sum(int a, int b) {
		
		System.out.println("the sum is : " +(a+b));
		
	}

	public void sum(int a, int b, int c) {
		
		System.out.println("the sum is : " +(a+b+c));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("enter first number : ");
		int num_1 = in.nextInt();
		System.out.print("enter second number : ");
		int num_2 = in.nextInt();
		System.out.print("enter third number : ");
		int num_3 = in.nextInt();
		homework_1 obj = new homework_1();
		obj.sum(num_1);
		obj.sum(num_1, num_2);
		obj.sum(num_1, num_2, num_3);
		
	}

}
