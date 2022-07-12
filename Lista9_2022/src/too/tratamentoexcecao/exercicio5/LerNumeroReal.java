package too.tratamentoexcecao.exercicio5;

import javax.swing.JOptionPane;

import too.tratamentoexcecao.exercicio4.NumeroNaoFornecidoException;

public class LerNumeroReal {
	/**
	* Lê um número real em uma caixa de diálogo.
	*
	* @param mensagem texto a ser exibido na caixa de diálogo;
	* @param titulo texto da barra de título da caixa de diálogo;
	* @param msgErro mensagem de erro a ser exibida caso o usuário não digite nenhum número e
	* <code>opcional</code> é false;
	* @param opcional se <code>true</code> aceita que nenhum número seja fornecido pelo usuário, se
	* <code>false</code> o número deve ser lido.
	*
	* @return um número inteiro ou null se o usuário cancelar a operação de leitura. Se o usuário não
	* fornecer nenhum número e <code> opcional</code> é <code>true</code> deve ser disparado a
	* exceção NumeroNaoFornecidoException.
	*
	* @throws NumeroNaoFornecidoException se o usuário não forneceu um número e opcional é true.
	* @throws NumberFormatException se o valor fornecido não puder ser convertido para um número
	* real.
	*/

	public static Float lerNumeroReal(String mensagem, String titulo, String msgErro, boolean opcional) throws NumeroNaoFornecidoException, NumberFormatException{
		Float numero;
		String string = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE);
			
		if(!opcional && string == null)
			return null;
		
		if(string == null || string.isBlank())
			throw new NumeroNaoFornecidoException(msgErro);
		
		try {
			numero = Float.parseFloat(string);
			return numero;
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException();
		}
	}

}
