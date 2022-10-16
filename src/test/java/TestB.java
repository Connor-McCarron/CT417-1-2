import org.joda.time.DateTime;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestB {
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    Module m1;
    Module m2;
    Module m3;
    Lecturer l1;
    Lecturer l2;
    Program ece;
    Program comp;
    Student[] group1 = new Student[]{};
    Student[] group2 = new Student[]{};
    Module[] mod1 = new Module[]{};
    Module[] mod2 = new Module[]{};
    Program[] progs = new Program[]{};
    DateTime eDate;
    DateTime sDate;
    DateTime dob1;
    DateTime dob2;
    DateTime dob3;
    DateTime dob4;
    DateTime dob5;
    CTB test;

    @BeforeEach
    public void populate(){
        // For loop is band-aid fix for null pointer exception look for cause if time
        for (int i=0; i<2; i++) {
            // Populate dates
            sDate = new DateTime(2022, 8, 1, 12, 30, 0, 0);
            eDate = new DateTime(2023, 6, 19, 12, 30, 0, 0);
            dob1 = new DateTime(2001, 1, 10, 12, 30, 0, 0);
            dob2 = new DateTime(2001, 4, 18, 12, 30, 0, 0);
            dob3 = new DateTime(2001, 3, 26, 12, 30, 0, 0);
            dob4 = new DateTime(2000, 8, 4, 12, 30, 0, 0);
            dob5 = new DateTime(1979, 12, 11, 12, 30, 0, 0);
            // Populate groups
            group1 = new Student[]{s1, s2};
            group2 = new Student[]{s3, s4};
            mod1 = new Module[]{m1, m2};
            mod2 = new Module[]{m2, m3};
            // Populate Class Objects
            // Programs
            ece = new Program("ECE", group1, mod1, sDate, eDate);
            comp = new Program("Comp Sci", group2, mod2, sDate, eDate);
            progs = new Program[]{ece, comp};
            // Students
            s1 = new Student("John", 21, dob1, 1221, ece, mod1);
            s2 = new Student("Amy", 21, dob2, 1222, ece, mod1);
            s3 = new Student("Sarah", 21, dob3, 1223, comp, mod2);
            s4 = new Student("Adam", 22, dob4, 1224, comp, mod2);
            // Lecturer
            l1 = new Lecturer("Aberdeen", 42, dob5, 12, mod1);
            l2 = new Lecturer("Michaels", 42, dob5, 13, mod2);
            // Modules
            m1 = new Module("Programming_3", 29102, group1, new Program[]{ece, comp}, l1);
            m2 = new Module("Digital Systems", 29213, group1, new Program[]{ece}, l1);
            m3 = new Module("Cloud Architecture", 2813, group2, new Program[]{comp}, l2);
        }
        test = new CTB();
    }

    // Tests two string method for courses and lists the students
    @Test
    @Order(1)
    void courseTest(){
        for(Program prog : new Program[]{ece, comp}) {
            test.courseToString(prog);
            test.listStudents(prog);
            System.out.println();
        }
    }

    // Tests the to string for the modules
    @Test
    @Order(2)
    void moduleTest(){
        for(Module mod : new Module[] {m1, m2, m3}) {
        test.moduleToString(mod);
        System.out.println();
        }
    }

    // Tests the to strings for the student objects
    @Test
    @Order(3)
    void studentTest(){
        for(Student stud : new Student[] {s1, s2, s3, s4}) {
            test.studentToString(stud);
            System.out.println();
        }
    }

    // Tests the lecturer to sting method
    @Test
    @Order(4)
    void lecturerTest(){
        for(Lecturer lect: new Lecturer[]{l1, l2}){
            test.lecturerToString(lect);
            System.out.println();
        }
    }

}
