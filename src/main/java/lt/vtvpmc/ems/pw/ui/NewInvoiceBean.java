package lt.vtvpmc.ems.pw.ui;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Invoice;



public class NewInvoiceBean {
	
	 @PersistenceContext
	    private EntityManager entityManager;
	 
	    
	    
	 	private String invoiceNumber;
		private String invoiceDate;
		private String invoiceCompany;
		private String invoiceClient;
		
	    @Transactional
	    public String save() {
	        Invoice invoice = new Invoice(invoiceDate,invoiceClient,invoiceCompany);
	        entityManager.persist(invoice);
	        return "basic";
	        
	        
	    }

		public EntityManager getEntityManager() {
			return entityManager;
		}

		public void setEntityManager(EntityManager entityManager) {
			this.entityManager = entityManager;
		}

		public String getInvoiceNumber() {
			return invoiceNumber;
		}

		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}

		public String getInvoiceDate() {
			return invoiceDate;
		}

		public void setInvoiceDate(String invoiceDate) {
			this.invoiceDate = invoiceDate;
		}

		public String getInvoiceCompany() {
			return invoiceCompany;
		}

		public void setInvoiceCompany(String invoiceCompany) {
			this.invoiceCompany = invoiceCompany;
		}

		public String getInvoiceClient() {
			return invoiceClient;
		}

		public void setInvoiceClient(String invoiceClient) {
			this.invoiceClient = invoiceClient;
		}

		
		
		
		
}

	
