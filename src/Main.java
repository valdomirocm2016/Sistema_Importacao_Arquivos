import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.dao.DAOGenerico;
import model.domain.ClienteImportacao;
import model.domain.Lote;
import model.service.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valdomiro
 */
public class Main {
    
    public static void main(String args[]) throws Exception {
        
	String dir = System.getProperty("user.dir") + "/src/arquivos/";
        File arquivos[];
             
        ListaArquivos ls = new ListaArquivos();
        arquivos= ls.getArquivos(dir);
        
        LeituraArquivo leitura = new LeituraArquivo();
        ProcessadoraArquivo processadora;
                
        for(int i=0;i<arquivos.length;i++){
                
             
             List<String> lista = leitura.lerArquivo(dir+arquivos[i].getName());
             String nomeArquivo=  leitura.getNomeArquivo();
               
             processadora = new ProcessadoraArquivo( TipoProcessador.valueOf(nomeArquivo).getProcessadorLinha());
	     List<Lote> result = processadora.processaArquivo(lista);
               
                
            Service.setDados_Banco(result);
            lista.clear();
            result.clear();
        }
                
              
	}
}
