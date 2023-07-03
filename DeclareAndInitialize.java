package Problems;

public class DeclareAndInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student(100,32456,"siddardha");
Student s2=new Student(101,44554,"kamlesh");
System.out.println(s);
	}
	

}
class Student{
	private int student_id;
	private double student_fee;
	private String student_name;
	public Student() {
		
	}
	
	public Student(int student_id, double student_fee, String student_name) {
		super();
		this.student_id = student_id;
		this.student_fee = student_fee;
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_fee=" + student_fee + ", student_name="
				+ student_name + "]";
	}
	
}
