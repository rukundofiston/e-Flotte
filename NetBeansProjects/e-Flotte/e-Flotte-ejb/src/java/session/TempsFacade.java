/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Temps;
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
public class TempsFacade extends AbstractFacade<Temps> implements TempsFacadeLocal {
    @PersistenceContext(unitName = "e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TempsFacade() {
        super(Temps.class);
    }
    
}
