import java.util.Scanner;

public class StudentInput {
    public Scanner sc = new Scanner(System.in);

    public String inputName() {
        System.out.print("Input name: ");

        return sc.nextLine().trim();
    }

    public int inputId() {
        System.out.print("Input ID: ");

        while (true) {
            try {
                String idTemp = sc.nextLine().trim();

                return Integer.parseInt(idTemp);
            } catch (NumberFormatException e) {
                System.out.print("Please! Input ID again: ");
            }
        }
    }

    public int inputAge() {
        System.out.print("Input age: ");
        while (true) {
            try {
                String ageTemp = sc.nextLine().trim();
                int age = Integer.parseInt(ageTemp);

                if (age < 5 || age > 100) {
                    throw new NumberFormatException();
                }

                return age;
            } catch (NumberFormatException e) {
                System.out.print("Please! Input age again: ");
            }
        }
    }

    public float inputGpa() {
        System.out.print("Input gpa: ");
        while (true) {
            try {
                String gpaTemp = sc.nextLine().trim();
                float gpa = Float.parseFloat(gpaTemp);
                if (gpa < 0 || gpa > 10) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException e) {
                System.out.print("Please! Input gpa again: ");
            }
        }
    }

    public String inputAddress() {
        System.out.print("Input address: ");

        return sc.nextLine().trim();
    }

    public int inputYorN() {
        System.out.print("Do you want delete (Y|N): ");
        int result;
        while (true) {
            String choose = sc.nextLine().trim().toUpperCase();
            switch (choose) {
                case "Y":
                    result = 1;
                    return result;
                case "N":
                    result = 0;
                    return result;
                default:
                    System.out.print("Please! Choose (Y or N) again: ");
                    break;
            }
        }
    }

    public int inputChoose() {
        return Integer.parseInt(sc.nextLine());
    }
}
