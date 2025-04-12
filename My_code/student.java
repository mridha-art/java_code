package inheritence;

public class student extends department {
	
	public void studen(int r, String sub, double res) {
		
		System.out.println("roll " + r + " in subject " + sub + " result " + res);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		student stn = new student();
		stn.studen(1, "math", 4);
		stn.courses("chemistry");
		stn.student_list(5000);
		
	}

}
