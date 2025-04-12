package inheritence;

public class department {
	
	public void courses(String course) {
	
		System.out.println("the course name is : "+course);
	}
	
	public void faulty_list(int faulty) {
		
		System.out.println("the number of faulty is : "+faulty);
	}
	
	public void student_list(int num) {
		
		System.out.println("the number of the student is : "+ num);
	}
	static int num1 = 10;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		department obj = new department();
		obj.courses("cse");
		obj.faulty_list(1200);
		obj.student_list(2000);
	}

}
