/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzeki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Student
 */
public class Rzeki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rzeka wisla = new Rzeka("Wisla", 1047);
        Rzeka odra = new Rzeka("Odra", 854);  
        Rzeka niemen = new Rzeka("Niemen", 937);
        Rzeka dzwina = new Rzeka("Dźwina", 1020);
        Morze baltyk = new Morze("Morze Bałtyckie", 377000);
        Rzeka dunaj = new Rzeka("Dunaj", 2860);
        Rzeka dniestr = new Rzeka("Dniestr", 1362);
        Rzeka dniepr = new Rzeka("Dniepr", 2201);
        Morze czarne = new Morze("Morze Czrne", 436402);   
        
        HashMap<Morze,List<Rzeka>> map = new HashMap();
        List<Rzeka> list1 = new ArrayList();
        list1.add(wisla);list1.add(odra);list1.add(niemen);
        list1.add(dzwina);
        List<Rzeka> list2 = new ArrayList();
        list2.add(dunaj);list2.add(dniestr);list2.add(dniepr);
        map.put(baltyk, list1);
        map.put(czarne, list2);
        
    }
    
}
