/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.session;

import io.github.oliviercailloux.y2017.bibliomr.modele.Object;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrubrice
 */
@Stateless
public class ObjectFacade extends AbstractFacade<Object> {

    @PersistenceContext(unitName = "biblioMRPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ObjectFacade() {
        super(Object.class);
    }
    
}
