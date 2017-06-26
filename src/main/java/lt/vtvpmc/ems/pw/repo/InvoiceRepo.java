package lt.vtvpmc.ems.pw.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ems.pw.entities.Invoice;


public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

}
