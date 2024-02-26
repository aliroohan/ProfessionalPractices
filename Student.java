// public class Student {
//     private int id;
//     String name;
//     int marks1;
//     int marks2;
//     public void setId(int num){
//         if (num <= 0){
//             System.out.println("Invalid ID");
//             return;
//         }
//         this.id = id;
//     }
//     public int getId(){
//         return id;
//     }
//     private double calculateAverage(){
//         double sum = marks1 + marks2;
//         return sum/2;
//     }
//     public boolean isPass(){
//         return calculateAverage() >= 35;
//     }
// }

public class Student{
    private String name;
    private int age;
    private int grade;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
}