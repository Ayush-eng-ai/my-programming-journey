

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


        Student1 s3 = new Student1();
        s3.name = "Rohit";
        s3.roll = 102;
        s3.password = "rohit123";
        s3.marks[0] = 85;
        s3.marks[1] = 90;
        s3.marks[2] = 95;
        for(int i = 0; i < 3; i++) {
            System.out.println(s3.marks[i]);
        }

        Student1 s4 = new Student1(s3);
        s4.password = "ayush123";
        s3.marks[2] = 100;
        System.out.println("blow up copy numbers:");
        for(int i = 0; i < 3; i++) {
            
            System.out.println( + s3.marks[i]);
        }
       
        System.out.println("Student Name: " + s3.name);
        System.out.println("Student Roll: " + s3.roll);
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


    //  uses copy constructor
    static class Student1 {
        String name;
        int roll;
        String password;
        int marks[];

        // Shallow copy constructor
        // Student1(Student1 s3) {
        //     marks = new int[3];
        //     this.name = s3.name;
        //     this.roll = s3.roll;
        //     this.marks = s3.marks;

        // }


        // Deep copy constructor
        Student1(Student1 s3) {
            this.name = s3.name;
            this.roll = s3.roll;
            this.marks = s3.marks.clone();
        }
        Student1() {
            marks = new int[3];
            System.out.println("This is a default constructor");
        }
        Student1(String name) {
            marks = new int[3];
            this.name = name;
        }
        Student1(int roll) {
            marks = new int[3];
            this.roll = roll;
        }



    }

        
}

// Inheritance:
//  1. Single Inheritance: A class inherits from a single parent class.
//  2. Multilevel Inheritance: A class inherits from a parent class, which
// 3. Hierarchical Inheritance: Multiple classes inherit from a single parent class.
// 4. Hybrid Inheritance: A combination of two or more types of inheritance. (Not supported in Java)
class OOPS2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Fish shark = new Fish();
        // shark.color = "Grey";
        // shark.fins = 8;
        // System.out.println("Fish Color: " + shark.color);
        // System.out.println("Fish Fins: " + shark.fins);
        // shark.eat();
        // shark.sleep();
        // shark.breath();
        // shark.swim();

        // Dog dobby = new Dog();
        // dobby.color = "Brown";
        // dobby.legs = 4;
        // System.out.println("Dog Color: " + dobby.color);
        // System.out.println("Dog Legs: " + dobby.legs);
        // dobby.breed = "Labrador";
        // System.out.println("Dog Breed: " + dobby.breed);
    }
// base class or parent class or super class
    static class Animal{
        String color;
        void eat() {
            System.out.println("Eating...");
        }
        void sleep() {
            System.out.println("Sleeping...");
        }
        void breath() {
            System.out.println("Breathing...");
        }

    }

// Hierarchical Inheritance
    static class Mammals extends Animal {
        void walk() {
            System.out.println("Walking...");
        }

    }

    static class Fish extends Animal {
        int fins;
        void swim() {
            System.out.println("Swimming...");
        }

    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("Flying...");
        }
    }       


// Multiple Inheritance is not supported in Java, but we can achieve it through interfaces.
    // static class Mammals extends Animal {
    //     int legs;
    //     void walk() {
    //         System.out.println("Walking...");
    //     }
    // }

    // static class Dog extends Mammals {
    //     String breed;
    //     void bark() {
    //         System.out.println("Barking...");
    //     }
    // }

// Single Inheritance
// derived class or child class or sub class
    // static class Fish extends Animal {
    //     int fins;
    //     void swim() {
    //         System.out.println("Swimming...");
    //     }

    // }
}



// Polymorphism:
// 1. Compile-time Polymorphism (Method Overloading): When multiple methods have the
// same name but different parameters, it is called method overloading. The method to be called is determined at compile time.
// 2. Runtime Polymorphism (Method Overriding): When a subclass provides a specific implementation of a method that is already defined in its superclass, it is called method overriding. The method to be called is determined at runtime based on the object type.


class OOPS3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5f, 3.5f));
        System.out.println("Sum of 1, 2 and 3: " + calc     .add(1, 2, 3)); 

        Deer deer = new Deer();
        deer.eat();

    }   
    static class Calculator {
        // Method Overloading
        int add(int a, int b) {
            return a + b;
        }

        float add(float a, float b) {
            return (a + b);
        }
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Method Overriding
    static class Animal {
        void eat () {
            System.out.println("Eats Anything...");
        }
    }

    static class Deer extends Animal{
        void eat() {
            System.out.println("Eats Grass...");
        }
    }


}

// Abstraction: Abstraction is the process of hiding the implementation details and showing only the functionality to the user. In Java, abstraction can be achieved using abstract classes and interfaces.
class OOPS4 {
    public static void main (String args[]) {
        System.out.println("Hello World!");

        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        System.out.println(horse.color);


        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
    }



}

abstract class Animal{
    public String color;

    Animal() {
       color = "Brown";
    }
    void eat() {
        System.out.println("Eats Anything...");
    }

    abstract void walk();

}

class Horse extends Animal {
    void changeColor() {
        color = "Black";
    }
    void walk() {
        System.out.println("Walks on 4 legs...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "White";
    }
    void walk() {
        System.out.println("Walks on 2 legs...");
    }
}


// Interface: An interface in Java is a blueprint of a class that contains static constants and abstract methods. It is used to achieve abstraction and multiple inheritance in Java. A class can implement multiple interfaces, but it can only extend one class.

@SuppressWarnings("unused")
class OOPS5 {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    @Override
    public void moves() {
        System.out.println("Moves in all 8 directions...");
    }
}

class Rook implements ChessPlayer {
    @Override
    public void moves() {
        System.out.println("Moves in 4 directions...");
    }
}

class King implements ChessPlayer {
    @Override
    public void moves() {
        System.out.println("Moves in 8 directions but only 1 step..."); 
    }
}

// Static keyword: The static keyword in Java is used to indicate that a particular member belongs to the class rather than to instances of the class. It can be applied to variables, methods, blocks, and nested classes. Static members can be accessed without creating an instance of the class.
class OOPS6 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "ABC School";
        System.out.println("Student 1 School Name: " + s1.schoolName);  
      

        Student s2 = new Student();   
        System.out.println("Student 2 School Name: " + s2.schoolName);

        Student s3 = new Student();
        System.out.println("Student 3 School Name: " + s3.schoolName);


          
    }

}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}


// Super keyword: The super keyword in Java is used to refer to the immediate parent class object. It can be used to access parent class methods and constructors. It is commonly used in method overriding and constructor chaining.
class OOPS7 {
    public static void main(String args[]) {

            Horse horse = new Horse();
            horse.changeColor();
            System.out.println("Horse Color: " + horse.color);
    
            Chicken chicken = new Chicken();
            chicken.changeColor();
            System.out.println("Chicken Color: " + chicken.color);
        
    }
}

class Animal {
    Animal() {
        System.out.println("Animal Constructor is called");   
    }
}

class Horse extends Animal {
    Horse() {
        super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Horse Constructor is called");
    }
}



   
