/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.session;

import io.github.oliviercailloux.y2017.bibliomr.modele.CorporateBody;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrubrice
 */
@Stateless
public class CorporateBodyFacade extends AbstractFacade<CorporateBody> {

    @PersistenceContext(unitName = "biblioMRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorporateBodyFacade() {
        super(CorporateBody.class);
    }
    
}
