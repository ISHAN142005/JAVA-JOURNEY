package self_learning.TELUSKO.ARRAYS_GO;

class Student {
    int RollNo;
    String Name;
    int Marks;
}

public class ArrayObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Ishan";
        s1.RollNo = 340;
        s1.Marks = 100;

        Student s2 = new Student();
        s2.Name = "Isha";
        s2.RollNo = 320;
        s2.Marks = 82;

        Student s3 = new Student();
        s3.Name = "Ish";
        s3.RollNo = 300;
        s3.Marks = 80;

        Student[] student = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println("Name:" + student[i].Name + "  Roll no:" + student[i].RollNo + "Marks:" + student[i].Marks);
        }
    }
}