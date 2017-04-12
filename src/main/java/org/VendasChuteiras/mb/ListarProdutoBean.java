/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendasChuteiras.mb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.TypedQuery;
import org.VendasChuteiras.DAO.produtoDAO;
import org.VendasChuteiras.modelo.Produto;

/**
 *
 * @author lucas rafael
 */
@Named(value = "mbListarProdutos")
@RequestScoped
public class ListarProdutoBean {

    
    @Inject
    private produtoDAO dao;
    private List<Produto> produtos;

    @PostConstruct
    private void init(){
        this.produtos = dao.buscarTodos();
   }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    

}
