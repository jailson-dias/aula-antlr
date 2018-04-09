package antlr;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;



import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import antlr.AntlrParser.GoalContext;

public class Teste {
	@Test
	public void Teste() throws Exception {
		File folder = new File("src/test/resources/");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	System.out.print("\n\nAnalisando o arquivo: ");
		        System.out.println(file);
				InputStream stream = new FileInputStream(file);
				ANTLRInputStream input = new ANTLRInputStream(stream);
				AntlrLexer lexer = new AntlrLexer(input);
				CommonTokenStream token = new CommonTokenStream(lexer);
				AntlrParser parser = new AntlrParser(token);
				parser.goal();
				assert parser.getNumberOfSyntaxErrors() == 0;
				System.out.print("Terminou de analisar o arquivo: ");
		        System.out.println(file);
		        System.out.println("\n");
		    }
		}		
	}
}