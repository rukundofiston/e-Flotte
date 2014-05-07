/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Entretien;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface EntretienFacadeLocal {

    void create(Entretien entretien);

    void edit(Entretien entretien);

    void remove(Entretien entretien);

    Entretien find(Object id);

    List<Entretien> findAll();

    List<Entretien> findRange(int[] range);

    int count();
    
}
