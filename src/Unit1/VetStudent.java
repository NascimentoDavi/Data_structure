package Unit1;

public class VetStudent{
    private Student[] vetStudent;
    private int quant;

    public VetStudent(int length){
        this.vetStudent = new Student[length];
        this.quant = 0;
    }

    public int getLength(){
        return this.vetStudent.length;
    }

    public int getQuant(){
        return this.quant;
    }

    public boolean isEmpty(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public boolean isFullFiled(){
        if(this.quant == this.vetStudent.length){
            return true;
        }
        return false;
    }

    public Student getStudent(int index){
        if(index >= 0 && index < this.quant){
            return this.vetStudent[index];
        }
        return null;
    }

    public float getGrade(int opt){
        if(opt == 1){
            return this.vetStudent[0].getGrades()[0];
        } else {
            return this.vetStudent[1].getGrades()[1];
        }
    }

    public int search(int enrollment){
        int i = 0;
        while(i < this.quant){
            if(this.vetStudent[i].getEnrollment() == enrollment){
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean insert(Student student){
        if(isFullFiled() == true){
            return false;
        } else {
            if(search(student.getEnrollment()) != -1){
                return false;
            } else {
                this.vetStudent[this.quant] = student;
                this.quant++;
                return true;
            }
        }
    }

    public boolean remove(int enrollment){
        if(search(enrollment) == -1){
            return false;
        } else {
            this.vetStudent[search(enrollment)] = null;
            this.quant--;
            return true;
        }
    }

    @Override
    public String toString(){
        String aux = "";
        for(int i = 0; i < this.quant; i++){
            aux += this.vetStudent[i].toString() + "\n";
        }
        return aux;
    }
}