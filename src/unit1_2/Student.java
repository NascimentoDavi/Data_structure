package unit1_2;

public class Student {

    private String name;
    private String enrollment;
    private String dateBirth;
    private double grade1, grade2, average;
    
    public Student(String name, String enrollment, String dateBirth, double grade1, double grade2){
        this.name = "";
        this.enrollment = "";
        this.dateBirth = "";
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Student(String name, String enrollment){
        this.name = "";
        this.enrollment = enrollment;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setenrollment(String enrollment){
        this.enrollment = enrollment;
    }   

    public void setDateBirth(String dateBirth){
        this.dateBirth = dateBirth;
    }

    public void setGrade1(double grade1){
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2){
        this.grade2 = grade2;
    }


    @Override
    public String toString(){
        return "Name : " + this.name + " | enrollment : " + this.enrollment + " | Date of Birth : " + this.dateBirth;
    }
}