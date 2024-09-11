import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManager s = new StudentManager();

        while (true) {
            menu();
            String choose = sc.nextLine().trim();
            switch (choose) {
                case "1":
                    s.add();
                    break;
                case "2":
                    s.edit();
                    break;
                case "3":
                    s.show();
                    break;
                case "4":
                    s.delete();
                    break;
                case "5":
                    s.sortStudentByGpa();
                    break;
                case "6":
                    s.sortStudentByName();
                    break;
                case "7":
                    s.findStudentByName();
                    break;
                case "0":
                    System.out.println("Exited.");
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please choose again.");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Show");
        System.out.println("4. Delete");
        System.out.println("5. Sort student by GPA");
        System.out.println("6. Sort studetn by name");
        System.out.println("7. Find student");
        System.out.println("0. Exit");
        System.out.print("Choose function: ");
    }
}