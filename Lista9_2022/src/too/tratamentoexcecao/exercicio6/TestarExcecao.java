package too.tratamentoexcecao.exercicio6;

import javax.swing.JOptionPane;

import too.tratamentoexcecao.exercicio4.NumeroNaoFornecidoException;
import too.tratamentoexcecao.exercicio5.LerNumeroReal;

public class TestarExcecao {

	private static final String NUMERO = "Número:",
			NUMERO_NAO_FORNECIDO = "Número não fornecido",
	 		TITULO = "Número real";

	public static void main(String[] args) {
		testarExcecao();
	}

	private static void testarExcecao() {
		try {
			JOptionPane.showMessageDialog(null, LerNumeroReal.lerNumeroReal(NUMERO, TITULO, NUMERO_NAO_FORNECIDO, true), TITULO, JOptionPane.INFORMATION_MESSAGE);
		}
		catch (NumeroNaoFornecidoException e) {
			JOptionPane.showMessageDialog(null, e.getMensagem(), TITULO, JOptionPane.ERROR_MESSAGE);
		}
	}
}
