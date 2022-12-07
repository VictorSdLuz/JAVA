package m02s03ex1;

public class TesteAluno {

	public static void TesteAluno(String[] args) {
		
		SuperAluno superAluno = new SuperAluno();
		SuperAluno superSubAluno = new SubAluno();
		SubAluno subAluno = new SubAluno();
		
		
		SuperAluno.exibir();
		SubAluno.exibir();
	}
}
