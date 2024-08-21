package diagnostic;

public class Patient {    
    private String name, CPF, birthDate, historic;
    
    public Patient(String name, String CPF, String birthDate){
        super();
        this.name = name;
        this.CPF = CPF;
        this.birthDate = birthDate;
        this.historic = "";
    }

    public String getName(){
        return this.name;
    }

    public void setNome(String name){
        this.name = name;
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public String getHistoric(){
        return this.historic;
    }

    public void setHistoric(String historic){
        this.historic = historic;
    }

    @Override
    public String toString(){
        return name + " - " + CPF + " - " + birthDate + "\n" + historic;
    }
}