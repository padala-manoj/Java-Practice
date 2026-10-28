public class Student {
    String name;
    int age; 
    double marks;
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    public void ispassed(){
        if(marks >= 30){
            System.out.println(name + " has passed the exam.");
        } else {
            System.out.println(name + " has failed the exam.");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Manoj";
        student1.age = 19;
        student1.marks = 85.5;
        
        Student student2 = new Student();
        student2.name = "Mani";
        student2.age = 19;
        student2.marks = 28.0;
        
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        student1.ispassed();
        
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        student2.ispassed();
    }
    
}
