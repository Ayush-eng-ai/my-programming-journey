// Question 1: Find out the correct statement to assign name to object


public class QuestionPractice {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ayush";
        System.out.println("Student Name: " + s1.name);
    }  
}

class Student {
    String name;
    int marks;

}


/*// Question 2: which variable(s) can the class person access in the following code?
        a) name
        b) weight
        c) rollNumber
        d) SchoolName
*/

public class QuestionPractice_1 {
    public static void main(String args[]) {
        person p1 = new person();
        p1.name = "Ayush";
        p1.weight = 70;
        // p1.rollNumber = 101; // This will cause a compile-time error
        // p1.SchoolName = "ABC School"; // This will also cause a compile-time error


        Student s1 = new Student();
        s1.name = "Ayush";
        s1.weight = 70;
        s1.rollNumber = 101;
        s1.SchoolName = "ABC School";

        System.out.println("Name: " + s1.name);
        System.out.println("Weight: " + s1.weight);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("School Name: " + s1.SchoolName);
    }  
}   


class person {
    String name;
    int weight;

}

class Student extends person {
    int rollNumber;
    String SchoolName;

}
