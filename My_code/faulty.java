package inheritence;

public class faulty extends department{
	
	public void exam(String exam1, String exam2) {
		
		System.out.println("the first exam is : "+exam1);
		System.out.println("the second exam is : "+exam2);
	
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	faulty oj = new faulty();
	oj.courses("math");
	oj.faulty_list(200);
	oj.exam("civil", "mechanical");
	System.out.println(num1);
		
		
	}

}
