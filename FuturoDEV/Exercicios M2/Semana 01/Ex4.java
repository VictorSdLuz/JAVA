package m02s01;

public class Ex4 {

	public static void main(String[] args) {
		
		
		String texto;

		texto = "Francisco";
		
		String reverso = new StringBuilder(texto).reverse().toString();
		System.out.println(reverso);

	}

}
