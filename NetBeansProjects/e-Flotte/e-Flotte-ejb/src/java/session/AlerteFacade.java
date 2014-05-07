/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Alerte;
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
public class AlerteFacade extends AbstractFacade<Alerte> implements AlerteFacadeLocal {
    @PersistenceContext(unitName = "e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlerteFacade() {
        super(Alerte.class);
    }
    
}
