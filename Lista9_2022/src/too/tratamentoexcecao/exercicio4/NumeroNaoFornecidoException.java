package too.tratamentoexcecao.exercicio4;

public class NumeroNaoFornecidoException extends RuntimeException{
	
	private static final String NUMERO_NAO_FORNECIDO = "Número não fornecido";
	
	private String mensagem;

	public NumeroNaoFornecidoException() {
		mensagem = NUMERO_NAO_FORNECIDO;
	}

	public NumeroNaoFornecidoException(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
