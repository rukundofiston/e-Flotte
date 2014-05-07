/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.GPS;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Stateless
@LocalBean
public class GPSFacade extends AbstractFacade<GPS> implements GPSFacadeLocal {
    @PersistenceContext(unitName = "e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GPSFacade() {
        super(GPS.class);
    }
    
}
