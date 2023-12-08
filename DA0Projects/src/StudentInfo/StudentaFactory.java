package StudentInfo;

public class StudentaFactory {
	StudentInteface createInstance() {
		return new Student_Imp_Class();
	}
}
