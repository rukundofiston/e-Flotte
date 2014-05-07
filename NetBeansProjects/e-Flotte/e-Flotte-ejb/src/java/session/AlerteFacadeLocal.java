/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Alerte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface AlerteFacadeLocal {

    void create(Alerte alerte);

    void edit(Alerte alerte);

    void remove(Alerte alerte);

    Alerte find(Object id);

    List<Alerte> findAll();

    List<Alerte> findRange(int[] range);

    int count();
    
}
