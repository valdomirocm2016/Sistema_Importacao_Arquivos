

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {

        private String nomeArquivo;
	public BufferedReader abrirArquivo(String arquivo) throws FileNotFoundException {
		File file = new File(arquivo);
                setNomeArquivo(file.getName());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
	public List<String> lerArquivo(String arquivo) throws FileNotFoundException,IOException {
                this.nomeArquivo=arquivo;
                
		BufferedReader br = abrirArquivo(arquivo);
		List<String> lista = new ArrayList<>();
		while (br.ready()) {
			lista.add(br.readLine());
		}
		return lista;
	}
        
        public String getNomeArquivo(){
            
            //String[] nome= nomeArquivo.split("/");
            //String nome_arquivo = nome[nome.length-1].toString();
            String[] str= nomeArquivo.split("_");
            
            //return str[0].toString().toUpperCase() ;
            return str[0].toString().toUpperCase();
        }
        private void setNomeArquivo(String nome){
            this.nomeArquivo=nome;
        }
	
	/*public static void main(String args[]) throws IOException,FileNotFoundException {
		LeituraArquivo la = new LeituraArquivo();
		String dir = System.getProperty("user.dir") + "/arquivos/";
		List<String> lista = la.lerArquivo(dir+"Cliente_20140220.txt");
		System.out.println(lista);
		
	}*/

}
