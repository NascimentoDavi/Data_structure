package Unit1;

public class App {
    public static void main(String[] args){

        Student student1 = new Student("Davi", 1);
        student1.setGrades(10, 2);
        System.out.println(student1.getAverage());

    }
}