import java.util.ArrayList;

public class StudentManager {
    private final StudentIO studentIO;
    private final StudentInput si;
    private final ArrayList<Student> studentList;

    public StudentManager() {
        studentIO = new StudentIO();
        studentList = studentIO.read();
        si = new StudentInput();
    }

    public void add() {
        int id = si.inputId();

        String name = si.inputName();

        int age = si.inputAge();

        String address = si.inputAddress();

        float gpa = si.inputGpa();

        Student student = new Student(id, name, age, address, gpa);

        studentList.add(student);

        studentIO.write(studentList);
    }

    public void edit() {
        System.out.println("Edit student: ");
        int id = si.inputId();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                float gpa = si.inputGpa();
                studentList.get(i).setGpa(gpa);

                studentIO.write(studentList);
            }
        }
    }

    public void delete() {
        int id = si.inputId();
        int emptyId = 1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                emptyId = 0;
                int choose = si.inputYorN();
                switch (choose) {
                    case 1:
                        studentList.remove(studentList.get(i));
                        studentIO.write(studentList);
                        System.out.println("Deleted successful");
                        break;
                    case 0:
                        System.out.println("Cancel");
                        break;
                }
            }
        }
        if (emptyId == 1) {
            System.out.println("Input ID: " + id + " isn't existed");
        }
    }

    public void show() {
        studentList.forEach(e -> System.out.println(e.toString()));
    }
}
