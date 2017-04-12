/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendasChuteiras.mb;

import org.VendasChuteiras.DAO.produtoDAO;
import org.VendasChuteiras.modelo.Produto;

/**
 *
 * @author trabalho
 */
public class CadastrarProdutoBean {
    Produto produto = new Produto();
 
     public void adicionar() {
         produtoDAO.salvar(produto)
}
     public Produto getProduto() {
         return produto;
     }
}
