package lt.vtvpmc.ems.pw.ui;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Client;





public class NewClientBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String clientFirstName;
    private String clientLastName;
    private String clientPhoneNumber;
    
    @Transactional
    public String save() {
        Client client = new Client(clientFirstName, clientLastName, clientPhoneNumber);
        entityManager.persist(client);
        return "main";
    }
    
    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }
    

    
}
