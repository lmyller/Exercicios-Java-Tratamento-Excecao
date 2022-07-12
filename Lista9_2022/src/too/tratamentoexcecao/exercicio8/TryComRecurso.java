package too.tratamentoexcecao.exercicio8;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TryComRecurso {

	public void lerArquivoTexto(String nomeArquivo) {
		try ( LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(nomeArquivo))) {			
			String linha;
			do { linha = lineNumberReader.readLine();
				if (linha!= null)
				System.out.println(linha);
			} while (linha != null);
			
		} catch (IOException e) {
			System.err.println("O arquivo " + nomeArquivo + " não foi encontrado.");
		}
	}
}
