package lt.vtvpmc.ems.pw.ui;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Invoice;

import lt.vtvpmc.ems.pw.repo.InvoiceRepo;



public class InvoiceListBean {
	
	 @PersistenceContext
	    private EntityManager entityManager;
	    

	  @Autowired
	  private InvoiceRepo repository;
	  
	    
	    @Transactional(readOnly = true)
	    public List<?> getInvoiceList() {
	        Query query = entityManager.createQuery("select i from Invoice i");
	        return query.getResultList();
	    }
	    
	     
	 
	    
	    @Transactional
	    public void removeInvoice(Invoice invoice) {
	        entityManager.remove(entityManager.merge(invoice));
	    }
	    
	    @Transactional
	    public Invoice save(Invoice invoice) {
	      return repository.save(invoice);
	    }
/*
	    public List<Invoice> findByCustomer(Client customer) {

	      TypedQuery query = entityManager.createQuery("select a from Invoice a where a.customer = ?1", Invoice.class);
	      query.setParameter(1, customer);

	      return query.getResultList();
	    }
*/
}
