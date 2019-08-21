
package dto.bzg.services;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//
//@XmlRootElement(name="Entities")
//@XmlType(propOrder={})
public class Entities {
            
        private TransferenciaOC tbltransferenciaoc;

    /**
     * @return the tbltransferenciaoc
     */
    public TransferenciaOC getTbltransferenciaoc() {
        return tbltransferenciaoc;
    }

    /**
     * @param tbltransferenciaoc the tbltransferenciaoc to set
     */
    public void setTbltransferenciaoc(TransferenciaOC tbltransferenciaoc) {
        this.tbltransferenciaoc = tbltransferenciaoc;
    }

  
	
}