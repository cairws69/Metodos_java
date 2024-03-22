package semana04;

public class Impressora {
	 
	/**
	 * Recebe uma palavra e imprime ela verticalmente
	 *
	 * @param palavra - a palavra a ser impressa em tela
	 */
	public static void impressaoVertical(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}
 
	/**
	 * Recebe um texto e o imprime n vezes 
	 *
	 * @param texto - texto que vai ser impresso na tela
	 * @param quantidade- quantidade de vezes que o texto será impresso
	 */
	public static void impressaoCopias(String texto, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.println(texto);
		}
	}
	/**
	 * Recebe um texto e devolve a quantidade de letras que ele tem
	 *
	 * @param texto - texto que vai ter sua quantidade de letras exposta
	 */
	public static void impressaoQtdLetras(String texto) {
		int charCount = 0;
		char n;
		for( int i = 0; i < texto.length( ); i++ )
		{
		    n = texto.charAt(i);
		    boolean t= Character.isLetter(n);;
		    if(t)
		        charCount++;
		}
		System.out.println("Quantidade de letras: "+charCount);
		System.out.println();
	}
	
	/**
	 * Recebe nomes de um array e imprime um em cada linha
	 * @param array - array com os nomes a serem impressos
	 */
	 public static void impressaoDeNomes(String[] nomes) {
			int i = 0;
			for(int n=0;n< nomes.length;n++) {
				System.out.println(nomes[i]);
				i++;
			}
	 }
		/**
		 * Recebe um texto e o imprime com cada letra em maiúsculo
		 *
		 * @param texto - texto que vai ser impresso na tela
		 */
		public static void impressaoLetrasCaixaAlta(String texto) {
				System.out.println(texto.toUpperCase());
			
		}
		
		
		
	}
	
	/*
	 * Sugestão de métodos: 1. Imprimir em ordem inversa (espelho) 2. Receber nomes
	 * de pessoas e imprimir uma pessoa em cada linha 3. Receber uma frase e
	 * imprimir todas as letras em maiúsculas ou todas as letras minúsculas 4.
	 * Receber uma frase e imprimir a frase sem as vogais 5. Receber uma frase e
	 * mostrar a quantidade de letras existentes
	 */
