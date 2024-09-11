import java.io.*;
import java.util.ArrayList;

public class StudentIO {
    private static final String STUDENT_FILE = "D:\\LuyenTapJava\\WorkspaceIJ\\heThongQuanLySinhVien\\src\\student.txt";

    public void write(ArrayList<Student> studentList) {
        File file = new File(STUDENT_FILE);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Student> read() {
        ArrayList<Student> studentList = new ArrayList<>();
        File file;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            file = new File(STUDENT_FILE);

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            studentList = (ArrayList<Student>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            throw new NullPointerException("File null");
        }finally {
            try {
                if (ois != null) {
                    ois.close();
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }
}
