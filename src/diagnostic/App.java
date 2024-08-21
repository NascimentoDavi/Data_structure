package diagnostic;
import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        VetPatient register = new VetPatient(5);
        int option;

        do {
            System.out.println("1 - Register\n" + "2 - Search\n" + "3 - Print Register\n" + "4 - Exit");
            option = Integer.parseInt(scan.nextLine());

            switch(option){
                case 1:
                    register(register);
                    break;
                case 2:
                    search(register);
                    break;
                case 3:
                    print(register);
                    break;
                case 4:
                    System.out.println("Exiting the system");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 4);
    }

    public static void register(VetPatient register){
        String name, birthDate, CPF;
        int ok;

        System.out.println("Patient Name: ");
        name = scan.nextLine();
        System.out.println("Patient's CPF: ");
        CPF = scan.nextLine();
        System.out.println("Birthday: ");
        birthDate = scan.nextLine();

        ok = register.insert(new Patient(name, CPF, birthDate));

        if(ok == 0){
            System.out.println("The patient was registered succesfully");
        } else if (ok == -1){
            System.out.println("Was not possible to register. Full array");
        } else {
            System.out.println("Was not possible to register, because this patient is already there");
        }
    }

    public static void search(VetPatient register){
        System.out.println("Patients CPF: (Press 'space' to exit)");
        String CPF = scan.nextLine();

        while(!CPF.equals(" ")){
            int index = register.search(CPF);
            
            if(index >= 0){
                System.out.println(register.getPatient(index).toString());
            } else {
                System.out.println(CPF + " was not found");
            }
            System.out.println("Patient CPF: (Pres 'space' to exit)");
            CPF = scan.nextLine(); 
        }
    }

    public static void print(VetPatient register){
        for(int i = 0; i < register.getQuant(); i++){
            Patient p = register.getPatient(i);
            System.out.println(p.getName()+"  "+
							   p.getCPF()+"  "+
							   p.getBirthDate());
        }
    }
}