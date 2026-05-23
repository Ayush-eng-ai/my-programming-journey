public class OOPS {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
       
        // Creating an object of the Pen class
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.setTip(5);
        System.out.println("Pen Color: " + pen1.color);
        System.out.println("Pen Tip: " + pen1.tip);
       
       
        // Creating an object of the Student class
        Student student1 = new Student();
        student1.setName("Alice");

        student1.setAge(20);
        student1.setPercentage(85, 90, 95);
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Age: " + student1.age);
        System.out.println("Student Percentage: " + student1.percentage);

        // Creating an object of the BankAccount class
        BankAccount account1 = new BankAccount("john_doe", "password123", 1000.0);
        System.out.println("Bank Account Username: " + account1.username);  
            // System.out.println("Bank Account Password: " + account1.password); // This will cause an error because password is private
            // System.out.println("Bank Account Balance: " + account1.balance); // This will cause an error because balance is private

    }

    static class Pen {
        // Properties of Pen
        String color;
        int tip;

        // Method to set color
        void setColor(String newColor) {
            color = newColor;
        }

        // Method to set tip
        void setTip(int newTip) {
            tip = newTip;
        }

    }

    static class Student {
        String name;
        int age;
        float percentage;

        void setName(String newName) {
            name = newName;
        }

        void setAge(int newAge) {
            age = newAge;
        }

        void setPercentage(int physics, int chemistry, int math) {
            percentage = (physics + chemistry + math) / 3 ;  
        }

    }


    static class BankAccount {
        public String username;
        private String password;
        public void setPassword(String newPassword) {
            password = newPassword;
        }   
        private double balance;
        public BankAccount(String username, String password, double balance) {
            this.username = username;
            this.password = password;
            this.balance = balance;
        }

    }
}



class OOPS1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // for Non-parameterized constructor
        Student s1 = new Student();
        // System.out.println("Student Name: " + s1.name);
        // System.out.println("Student Roll: " + s1.roll);

        // for parameterized constructor
        Student s2 = new Student("Ayush", 101);

        System.out.println("Student Name: " + s2.name);
        System.out.println("Student Roll: " + s2.roll);  
    }

    static class Student {
        String name;
        int roll;

        // Non-parameterized constructor(default constructor)
        Student() {
            System.out.println("This is a default constructor");
        }

        // parameterized constructor
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
       
    }
}
   
