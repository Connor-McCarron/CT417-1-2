// A bunch of to string methods for class objects from part a
public class CTB {
    public void courseToString(Program prog){
        String name = prog.getName();
        Module[] mods = prog.getModules();
        String sDay = prog.getStartDate().toString();
        String eDay = prog.getEndDate().toString();
        System.out.println("Program: " + name);
        System.out.print("Modules: ");
        for(Module mod: mods) {
            System.out.print(mod.getName() + ", ");
        }
        System.out.println();
        System.out.println("Start of Term: " + sDay);
        System.out.println("End of Term: " + eDay);

    }

    public void studentToString(Student stud) {
        String name = stud.getName();
        int age = stud.getAge();
        String dob = stud.getDob().toString();
        int id = stud.getId();
        String prog = stud.getCourse().getName();
        Module[] mods = stud.getModules();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Born: " + dob);
        System.out.println("ID: " + id);
        System.out.println(stud.getUsername() + "@nuigalway.ie");
        System.out.println("Student of " + prog);
        for(Module mod: mods) {
            System.out.println("Studying: " + mod.getName() + ", ");
        }

    }

    public void moduleToString(Module mod) {
        String name = mod.getName();
        int id = mod.getId();
        Program[] progs = mod.getPrograms();
        Lecturer lect = mod.getLecturer();
        // Prints out info
        System.out.println("Module Name: " + name);
        System.out.println("Module ID: " + id);
        System.out.println("Taught By: " + lect.getName());
        System.out.print("To Students in :");
        for(Program prog: progs) {
            System.out.print(prog.getName() + ", ");
        }
        System.out.println();
    }

    public void lecturerToString(Lecturer lect){
        String name = lect.getName();
        int age = lect.getAge();
        String dob = lect.getDob().toString();
        int id = lect.getId();
        Module[] mods = lect.getModules();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Born: " + dob);
        System.out.println("ID: " + id);
        System.out.println(lect.getUsername() + "@nuigalway.ie");
        for(Module mod: mods) {
            System.out.println("Teaches: " + mod.getName() + ", ");
        }
    }

    public void listStudents(Program prog){
        printStudents(prog.getStudents());
    }
    public void listStudents(Module mod){
        printStudents(mod.getStudents());
    }

    private void printStudents(Student[] studs){
        System.out.println("List of Students");
        for(Student s : studs){
            System.out.println(s.getName());
        }
    }

}
