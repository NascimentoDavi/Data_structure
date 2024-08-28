package Unit1;
/*
 * Faça uma classe que define um objeto Aluno com os seguinte atributos: 
 * nome, 
 * matricula (int), 
 * duas notas e 
 * média. 
 * Faça o construtor, os métodos gets e sets, toString e 
 * compareTo (que compara o nome de dois alunos e devolve o resultado 
 * da comparação deste atributo nome).
 */
public class Aluno {
	private String nome;
	private int matricula;
	private double nota1, nota2, media;
	
	public Aluno(String nome, int matricula, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.calculaMedia();
	}
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
		this.calculaMedia();
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
		this.calculaMedia();
	}
	public double getMedia() {
		return media;
	}
	private void calculaMedia() {
		this.media = (this.nota1+this.nota2)/2;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media="
				+ media + "]";
	}
	/*
	 * compareTo (que compara o nome de dois alunos e devolve o resultado 
	 * da comparação deste atributo nome).
	 */
	public int compareTo (Aluno outro) {
		return (this.nome.compareToIgnoreCase(outro.nome));
		
	}
}









