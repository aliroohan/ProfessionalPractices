public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setName("Alice");
        s1.setAge(16);
        s1.setGrade(10);

        s2.setName("Bob");
        s2.setAge(18);
        s2.setGrade(12);
        
        System.out.println("Details of student 1:");
        s1.displayDetails();
        
        System.out.println("Details of student 2:");
        s2.displayDetails();
        
        System.out.println("Details of student 1 after promotion:");
        s1.promote();
        s1.displayDetails();
        
        System.out.println("Is student 2 an adult? " + s2.isAdult());    
    }
}