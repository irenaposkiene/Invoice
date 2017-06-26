
package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class StudentListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getStudentList() {
        Query query = entityManager.createQuery("select c from Student c");
        return query.getResultList();
    }
    
    @Transactional
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }
    
}
