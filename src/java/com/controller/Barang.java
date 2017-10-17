/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class Barang {
    @PersistenceContext
    private EntityManager em;

    public Barang() {
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
     public List<Product> findAll() {
        List<Product> products = em.createNamedQuery("Product.findAll").getResultList();
        return products;
          
    }
     
     public Product findById(Integer customerId) {
       Product product = em.find(Product.class, customerId);
       return product;
    }
}
