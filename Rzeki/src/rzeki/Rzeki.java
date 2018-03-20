/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rzeki;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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
        
        Collection<Morze> morza = map.keySet();
        Random r = new Random();
        int i = r.nextInt(morza.size());
        Iterator<Morze> iterator = morza.iterator();
        Morze morze = null; 
        int licznik = 0;
        while(iterator.hasNext())
        {
            morze = iterator.next();
            System.out.println(i+ " "+licznik+" " +morze);
            if(licznik==i) break; 
            licznik++;
        }
        
        List<Rzeka> rzeki = map.get(morze);
        System.out.println(morze);
        
        Rzeka najdluzsza = rzeki.get(0);
        for(Rzeka rz : rzeki)
        {
            if(rz.getDlugosc()>najdluzsza.getDlugosc())
            {
                najdluzsza = rz;
            }
        }
    }
    
}
