/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementadores;

import interfaces.TipoDocumento;

/**
 *
 * @author ice
 */
public class TipoDocumentoBoleto implements TipoDocumento {
    
    private static TipoDocumentoBoleto tipoDocumentoBoleto = new TipoDocumentoBoleto();
    
    private static TipoDocumentoBoleto getTipoDocumentoBoleto()
    {
        return tipoDocumentoBoleto;
    }
}
