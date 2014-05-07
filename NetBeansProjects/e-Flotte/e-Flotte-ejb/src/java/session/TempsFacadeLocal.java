/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Temps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface TempsFacadeLocal {

    void create(Temps temps);

    void edit(Temps temps);

    void remove(Temps temps);

    Temps find(Object id);

    List<Temps> findAll();

    List<Temps> findRange(int[] range);

    int count();
    
}
