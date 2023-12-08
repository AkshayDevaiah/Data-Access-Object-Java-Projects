package StudentUsingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImplementation implements Studentinterface {
	private List<Student> al = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int nextId = 1;

    public void choice() {
        System.out.println("Press 1 to Insert");
        System.out.println("Press 2 to Update");
        System.out.println("Press 3 to Delete");
        System.out.println("Press 4 to view Records");
        System.out.println("Press 5 to Exit"); //Actually any key apart from 1,2,3,4 will make my program to exit
        System.out.println("Dear user,select your Choice: "); //For some purpose I've given 5 as a choice to exit..
    }

    public void insert() {
        System.out.println("Enter the Student ID: ");
        int sId = sc.nextInt();
        System.out.println("Enter the Student name: ");
        String sName = sc.nextLine();
        sc.next();   //Consumes New-Line character!
        System.out.println("Enter his/her Skill: ");
        sc.nextLine();  //Consumes New-Line character!
        String sSkill = sc.nextLine();
        Student s = new Student(sId, sName, sSkill);
        al.add(s);
        System.out.println("Added Successfully!\n");
    }


    public void update() {
        System.out.println("Enter the Student Id to Update his record: ");
        int Id = sc.nextInt();
        for (Student s : al) {
            if (Id == s.getId()) {
                System.out.println("To Update name Press 1: \nand For Skill press 2: ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    System.out.println("Enter the name: ");
                    sc.nextLine();  //Consumes New-Line character!
                    s.setName(sc.nextLine());
                } else if (ch == 2) {
                    System.out.println("Enter the Skill: ");
                    sc.nextLine(); //Consumes New-Line character!
                    s.setSkill(sc.nextLine());
                } else {
                    System.out.println("Please provide valid Details.");
                    return;
                }

            } else {
                System.out.println("Id was not Found");
                return;
            }
        }
    }

    public void delete() {
        System.out.println("Enter the Student Id to Delete his record: ");
        int Id = sc.nextInt();
        for (Student st : al) {
            if (st.getId() == Id) {
                al.remove(st);
                return;
            } else {
                System.out.println("Sorry Student with Id number " + Id + " Not Found");
            }
        }
    }

    public List<Student> getStuRecords() {
            return al;
        }
}
