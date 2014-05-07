/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Carburant;
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
public class CarburantFacade extends AbstractFacade<Carburant> implements CarburantFacadeLocal {
    @PersistenceContext(unitName = "e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CarburantFacade() {
        super(Carburant.class);
    }
    
}
