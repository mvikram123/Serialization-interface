import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements java.io.Serializable{

    String stu_name;
    int stu_age;
    int stu_id;

    public Student(String stu_name, int stu_age, int stu_id) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.stu_id = stu_id;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s=new Student("vikram",26,2);
       // s.stu_name="vikram";
       // s.stu_age=26;
       // s.stu_id=01;
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("s.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(s);// converting object into byte stream or other format file like .txt
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("object serialized and saved in txt format"+objectOutputStream);
        }
        catch(IOException i){
            i.printStackTrace();

        }

    }
}