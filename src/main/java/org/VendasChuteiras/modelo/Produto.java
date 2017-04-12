/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendasChuteiras.modelo;

/**
 *
 * @author lucas r.
 */
@Entity
public class Produto {
      @id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
}
