
import java.io.File;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valdomiro
 */
public class ListaArquivos {
    
    private File arquivos[];
    private File documentos;
    
    public File[] getArquivos(String diretorio){
        
         this.documentos = new File(diretorio);
         this.arquivos= documentos.listFiles();
         Arrays.sort(arquivos);
         return arquivos;
    }
}
