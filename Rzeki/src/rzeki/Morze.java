/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzeki;

/**
 *
 * @author Student
 */
public class Morze {
    
    private String nazwa;
    private double powierzchnia;
    
    public Morze(String nazwa, double powierzchnia)
    {
        this.nazwa = nazwa;
        this.powierzchnia = powierzchnia;
    }
    
    @Override 
    public String toString() {
        return "Morze(" + "nazwa= " + nazwa +" powierzchnia= " + powierzchnia;
    }
    
    public boolean equals(Morze m)
    {
        return nazwa.equals(m.nazwa);
    }    
    
    
            
    
}
