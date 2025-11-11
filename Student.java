public class Student {
    private String name;
    private int age;
    private char grade;
    //default constructor
    public Student()
        {
            this.name = "Unknown";
            this.age = 0;
            this.grade = 'A';
        }
        // parameterized constructor 
        public Student(String name, int age, char grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // method to display student details
        public void displayDetails() {
            System.out.println("name: " + name);
            System.out.println("age: " + age);
            System.out.println("grade: " + grade);
        }
        public static void main(String args[]) {
            // demo: default student and a parameterized student
            Student student1 = new Student();
            Student student2 = new Student("Alice", 20, 'B');
        // display student details
        System.out.println("Student 1:");
        student1.displayDetails();
        System.out.println();
        System.out.println("Student 2:");
        student2.displayDetails();
    }
    
    
}
