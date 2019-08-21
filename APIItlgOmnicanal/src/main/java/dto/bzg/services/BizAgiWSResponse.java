
package dto.bzg.services;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//
//@XmlRootElement(name="BizAgiWSResponse")
//@XmlType(propOrder={})
public class BizAgiWSResponse {
	
        private Entities entities;

    /**
     * @return the entities
     */
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities the entities to set
     */
    public void setEntities(Entities entities) {
        this.entities = entities;
    }
       

    
}