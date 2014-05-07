/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.MobileManager;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author RUKUNDO Fiston Bruno
 */
@Stateless
@LocalBean
public class MobileManagerFacade extends AbstractFacade<MobileManager> implements MobileManagerFacadeLocal {
    @PersistenceContext(unitName = "e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MobileManagerFacade() {
        super(MobileManager.class);
    }
    @Override
    public List<MobileManager> AllMobile(){
        Query q=em.createQuery("SELECT m FROM MobileManager m");
        return q.getResultList();
    }
}