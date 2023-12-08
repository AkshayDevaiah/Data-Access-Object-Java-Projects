package StudentUsingCollections;

public class StudentFactory {
	 public static Studentinterface genStuImpObj() {
         return new StudentImplementation();
     }
}
