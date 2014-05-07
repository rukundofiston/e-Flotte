/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Carburant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface CarburantFacadeLocal {

    void create(Carburant carburant);

    void edit(Carburant carburant);

    void remove(Carburant carburant);

    Carburant find(Object id);

    List<Carburant> findAll();

    List<Carburant> findRange(int[] range);

    int count();
    
}
