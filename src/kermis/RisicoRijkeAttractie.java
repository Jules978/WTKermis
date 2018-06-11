/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kermis;

/**
 *
 * @author Julia
 */
abstract class RisicoRijkeAttractie extends Attractie {
    
    int draaiLimiet;

    abstract boolean opstellingsKeuring() throws DraaiLimietException;
}