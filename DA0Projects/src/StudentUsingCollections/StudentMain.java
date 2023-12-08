package StudentUsingCollections;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Studentinterface StuImp = StudentFactory.genStuImpObj();
        int choice = 0;
        int count = 0;

        while (choice <= 4) {
            StuImp.choice();
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    StuImp.insert();
                    count++;
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Sorry No records were added,\nKindly add the Student's very first record: \n");
                        StuImp.insert();
                    }
                    else {
                        StuImp.update();
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Sorry No records were added,\nKindly add the Student's very first record: \n");
                        StuImp.insert();
                    }
                    else {
                        StuImp.delete();
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("Sorry No records were added,\nKindly add the Student's very first record: \n");
                        StuImp.insert();
                    } else {
                        System.out.println(StuImp.getStuRecords() + "\n");
                    }
                    break;
            }
        }

	}

}
