/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.MobileManager;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Local
public interface MobileManagerFacadeLocal {

    void create(MobileManager mobileManager);

    void edit(MobileManager mobileManager);

    void remove(MobileManager mobileManager);

    MobileManager find(Object id);

    List<MobileManager> findAll();

    List<MobileManager> findRange(int[] range);

    int count();
    public List<MobileManager> AllMobile();
    
}
