package Unit1;
import Unit1.InOut;

public class AppStudentComMenu {
	private static int quant = 0;
	public static void main(String[] args) {
		Student[] cadStudent = new Student[5];
		int opcao;
		
		do {
			opcao = InOut.leInt("MENU\n"+
					" 1. Cadastrar    \n" + 
					" 2. Imprimir Student    \n" + 
					" 3. Imprime todos    \n" + 
					" 4. Alterar Nota 1    \n" + 
					" 5. Alterar Nota 2    \n" + 
					" 6. Sair");
					
			switch (opcao) {
			case 1:
				cadastrar (cadStudent);
				break;
			case 2: 
				mostraStudent (cadStudent);
				break;
			case 3: 
				imprimeTodos (cadStudent);
				break;
			case 4: 
				alteraNota1(cadStudent);
				break;
			case 5:
				alteraNota2(cadStudent);
				break;
			case 6:
			System.out.println("Saindo...");
				System.exit(0);
			default:
				InOut.msgDeErro("ERRO", "OPCAO INVALIDA");
			}
		}while (opcao!= 6);

	}

	public static void cadastrar(Student[] cadStudent) {
		if (quant==cadStudent.length) {
			System.out.println("Vetor cheio");
		} else {
			String nome = InOut.leString("NOME");
			int matr = InOut.leInt("MATRICULA");
			double nota1 = InOut.leDouble("NOTA 1");
			double nota2 = InOut.leDouble("NOTA 2");
			// solve this line: cadStudent[quant] = new Student(nome, matr, nota1, nota2);
			quant++;
		}
	}
	public static void mostraStudent(Student[] cadStudent) {
		String nome = InOut.leString("Nome do Student");
		int pos = pesquisa(cadStudent, nome);
		if (pos!=-1) {
			System.out.println("REGISTRO\n" + cadStudent[pos].toString());
		} else {
			System.out.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}

	public static void imprimeTodos(Student[] cadStudent) {
		for (Student Student: cadStudent){
			System.out.println (Student.toString()+"\n");
		}
	}
	public static int pesquisa (Student[] cadStudent, String nome) {
		for (int i=0; i<quant; i++) {
			if (cadStudent[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1;
	}

	private static void alteraNota1(Student[] cadStudent) {
		String nome = InOut.leString("Nome do Student");
		int pos = pesquisa(cadStudent, nome);
		double nota;
		if (pos!=-1) {
		do {
			nota = InOut.leDouble("Nota1 = "+cadStudent[pos].getNota1()+
					"\nEntre com a nova nota1 de 0 a 10");
		}while (nota<0 || nota>10);
		cadStudent[pos].setNota1(nota);
		} else {
			System.out.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}
	private static void alteraNota2(Student[] cadStudent) {
		String nome = InOut.leString("Nome do Student");
		int pos = pesquisa(cadStudent, nome);
		double nota;
		if (pos!=-1) {
		do {
			nota = InOut.leDouble("Nota2 = "+cadStudent[pos].getNota2()+
					"\nEntre com a nova nota1 de 0 a 10");
		}while (nota<0 || nota>10);
		cadStudent[pos].setNota2(nota);
		} else {
			System.out.println("ERRO\n" + nome + "  nao cadastrado");
		}
	}

}
