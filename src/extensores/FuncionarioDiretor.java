/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extensores;

import implementadores.TipoDocumentoMatricula;
import modelo.Funcionario;

/**
 *
 * @author ice
 */
public class FuncionarioDiretor extends Funcionario{

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoMatricula.getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo()
    {
        return "Diretor";
    }

    
}
