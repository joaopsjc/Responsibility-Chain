/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoDocumentoDiploma;
import modelo.Funcionario;

/**
 *
 * @author ice
 */
public class FuncionarioReitor extends Funcionario{

    public FuncionarioReitor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoDiploma.getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Reitor";
    }

    
}
