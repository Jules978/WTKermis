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
public class DraaiLimietException extends RuntimeException {
    public Spin spin;
    public Hawaii hawaii;
    private RisicoRijkeAttractie risicoAtractie;
    
    public DraaiLimietException(Spin spin) {
    this.spin = spin;
    
    }
    
    public DraaiLimietException(Hawaii hawaii) {
    this.hawaii = hawaii;
    
    }
    
    public DraaiLimietException(RisicoRijkeAttractie attractie) {
    this.risicoAtractie = attractie;
    
    }
}
