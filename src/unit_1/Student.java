package unit_1;

public class Student {
    private String name;
    private int enrollment;
    private float[] grades = new float[2];
    private double average;

    public Student(String name, int enrollment){
        this.name = name;
        this.grades[0] = 0;
        this.grades[1] = 0;
        this.enrollment = enrollment;
        this.average = (grades[0] + grades[1]) / 2;
    }

    public String getName(){
        return this.name;
    }

    public int getEnrollment(){
        return this.enrollment;
    }

    public float[] getGrades(){
        return new float[]{this.grades[0], this.grades[1]};
    }

    public double getAverage(){
        return this.average;
    }

    public void setGrades(float grade1, float grade2){
        this.grades[0] = grade1;
        this.grades[1] = grade2;
        this.average = (grade1 + grade2) / 2;
    } 

    public boolean compareTo(String name){
        if(this.name.equals(name)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return name + " - " + enrollment + " - " + grades[0] + " - " + grades[1] + " - " + average;
    }
}