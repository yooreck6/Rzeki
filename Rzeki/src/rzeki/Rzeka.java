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
public class Rzeka {
    
    private String nazwa;
    private int dlugosc;
    
    public Rzeka(String nazwa, int dlugosc)
    {
        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
    }
    
    @Override
    public String toString() {
        return "Rzeka(" + "nazwa=" + nazwa + "dlugosc=" + dlugosc;
    }
    
    public boolean equals(Rzeka r)
    {
        return nazwa.equals(r.nazwa);
    }
    
    public int getDlugosc() 
    {
        return dlugosc;
    }
    
}
