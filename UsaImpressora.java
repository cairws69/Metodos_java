package semana04;

public class UsaImpressora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
        // Testando impressaoVertical
        System.out.println("Impressão Vertical:");
        Impressora.impressaoVertical("Java");
        System.out.println();
        
        // Testando impressaoCopias
        System.out.println("Impressão de 3 cópias:");
        Impressora.impressaoCopias("Hello, World!", 3);
        System.out.println();
        
     // Testando impressaoQtdLetras
        System.out.println("Contagem de letras em 'Hello':");
        Impressora.impressaoQtdLetras("Hello");
        System.out.println();
        
        // Testando impressaoDeNomes
        System.out.println("Impressao de nomes:");
        String[] nomes = {"Joao","Pedro"};
        Impressora.impressaoDeNomes(nomes);
        System.out.println();
        
     // Testando impressaoLetrasCaixaAlta
        System.out.println("Impressao em caixa alta:");
        Impressora.impressaoLetrasCaixaAlta("Hello, world!!");
        System.out.println();
        
        
	}

}
