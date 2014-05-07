/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.GPS;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface GPSFacadeLocal {

    void create(GPS gPS);

    void edit(GPS gPS);

    void remove(GPS gPS);

    GPS find(Object id);

    List<GPS> findAll();

    List<GPS> findRange(int[] range);

    int count();
    
}
