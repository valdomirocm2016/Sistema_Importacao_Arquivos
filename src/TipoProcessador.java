import model.domain.ClienteImportacao;
import model.domain.ContaImportacao;
import model.domain.PlasticoImportacao;
import model.domain.TransacaoImportacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Valdomiro
 */
public enum TipoProcessador {
    
    CLIENTE(new ProcessadoraCliente()),
    CONTA(new ProcessadoraConta()),
    TRANSACAO(new ProcessadoraTransacao()),
    PLASTICO(new ProcessadoraPlastico());
   
    private ProcessadorLinha processadorLinha;
    
    TipoProcessador(ProcessadorLinha processador){
       
       this.processadorLinha=processador;
     }
    /**
     * @return the processadorLinha
     */
    public ProcessadorLinha getProcessadorLinha() {
        return processadorLinha;
    }
    
}
