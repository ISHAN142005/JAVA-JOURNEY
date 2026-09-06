package self_learning.TELUSKO.ONE;

class Student {
    int RollNo;
    String Name;
    int Marks;
}

public class EnhancedForLoop {
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

        Student[] student = new Student[3];//ARRAY OF OBJECTS
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (Student stud : student) {
            System.out.println(stud.Name + ":" + stud.RollNo);
        }
    }
}

//WORK FLOW
//Student stud : student means:
//
//Take each element from the student array one by one.
//
//Assign it to the variable stud.
//
//Run the loop body with that stud.