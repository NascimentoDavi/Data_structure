package diagnostic;

public class VetPatient {
    private Patient[] vetPatient;
    private int quant;

    public VetPatient(int length){
        this.vetPatient = new Patient[length];
        this.quant = 0;
    }

    public int length(){
        return this.vetPatient.length;
    }

    public int getQuant(){
        return this.quant;
    }

    public Patient getPatient(int index){
        if(index >= 0 && index < this.quant){
            return this.vetPatient[index];
        }
        return null;
    }

    public boolean isEmpty(){
        if(this.quant == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.quant == this.vetPatient.length){
            return true;
        }
        return false;
    }

    /*
     * search => do the sequential search for the patient's CPF and return the position.
     */
    public int search(String CPF){
        for(int i = 0; i < this.quant; i++){
            if(this.vetPatient[i].getCPF().equals(CPF)){
                return i;
            }
        }
        return -1;
    }

    /*
     * insert => insert a patient in the first empty position.
     */
    public int insert(Patient patient){
        int pos;
        if(isFull()){
            return -1;
        } else {
            pos = search(patient.getCPF());
            if(pos != -1){
                return -2;
            } else {
                this.vetPatient[this.quant] = patient;
                this.quant++;
                return 0;
            }
        }
    }

    /*
     * remove => remove the patient whose CPF is passed as argument inside the method.
     */
    public boolean remove(String CPF){
        int pos = search(CPF);
        if(pos == -1){
            return false;
        }
        this.vetPatient[pos] = this.vetPatient[this.quant-1];
        this.vetPatient[this.quant-1] = null;
        this.quant--;
        return true;
    }

    @Override
    public String toString(){
        String aux = "";
        for(int i = 0; i<this.quant; i++){
            aux += vetPatient[i].toString() + "\n\n";
        }
        return aux;
    }
}