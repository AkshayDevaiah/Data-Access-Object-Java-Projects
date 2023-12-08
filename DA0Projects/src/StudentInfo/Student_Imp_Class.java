package StudentInfo;

public class Student_Imp_Class implements StudentInteface{
	Student[] s=new Student[2];
	int ind=0;
	public Student[] lis_all() {
		return s;
	}
	public Student search(int id) {
		Student s2=null;
		for(Student s1:s) {
			if(id==s1.getId()) {
				s2=s1;
			}
		}
		return s2;
	}
	public void add(Student s1) {
		s[ind]=s1;
		ind++;
	}
	
}
