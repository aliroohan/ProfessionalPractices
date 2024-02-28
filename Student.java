public class Student {
    private int id;
    String name;
    int marks1;
    int marks2;
    public void setId(int id){
        this.id = id;
    }
    private double calculateAverage(){
        double sum = marks1 + marks2;
        return sum/2;
    }
    public boolean isPass(){
        return calculateAverage() >= 35;
    }

 //this is a comment.
}
