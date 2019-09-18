/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoDocumentoCertificado;
import modelo.Funcionario;

/**
 *
 * @author ice
 */
public class FuncionarioSecretaria extends Funcionario{

    public FuncionarioSecretaria(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Coordenador";
    }

    
}
