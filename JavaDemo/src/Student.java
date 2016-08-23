
public class Student {

	
	public void writeExam() {
		
		
	}
	
	public void writeExam(String pen) {
		
	}
	
	public void writeExam(String pen, String paper, String pencil) {
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.writeExam("Parker");
		
		Student s2 = new Student();
		s2.writeExam("Parker", "ClassmatePapaer", "Pencil");

		Student s3 = new Student();
		s3.writeExam();

	}
}
