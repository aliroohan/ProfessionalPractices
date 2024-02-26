public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setId(1);
        s1.name = "John";
        s1.marks1 = 80;
        s1.marks2 = 70;
        System.out.println(s1.isPass());
    }
}