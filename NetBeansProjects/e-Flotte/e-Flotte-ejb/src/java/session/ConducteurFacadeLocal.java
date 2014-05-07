/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Conducteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface ConducteurFacadeLocal {

    void create(Conducteur conducteur);

    void edit(Conducteur conducteur);

    void remove(Conducteur conducteur);

    Conducteur find(Object id);

    List<Conducteur> findAll();

    List<Conducteur> findRange(int[] range);

    int count();
    
}
