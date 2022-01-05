/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author babar_muhammad_anas
 */
public class Nodo {
        public Integer indice;
        public List<Integer> vicini;
        public int x, y;
        public boolean presentePokemon;
        public Pokemon pokemon;
        public boolean selezionato;
        public Nodo()
        {
            vicini = new ArrayList<>();
            x = 0;
            y = 0;
        }
        public Nodo(int i)
        {
            vicini = new ArrayList<>();
            indice = i;
            x = 0;
            y = 0;
        }
        public void AddVicino(int n)
        {
            vicini.add(n);
        }
        

        public HashSet<Integer> Raggiungibili(List<Nodo> mappa, Integer passi)
        {
            HashSet<Integer> ris = new HashSet<Integer>();
            Queue<Pair> daVisitare = new LinkedList();
            daVisitare.add(new Pair(0, this.indice));
            if(!presentePokemon)
                ris.add(indice);
            while (daVisitare.size() > 0)
            {
                Pair pair = daVisitare.poll();
                if (pair.key >= passi)
                    continue;
                //for( Integer vicino: Mappa[pair.value].vicini )
                for (Integer vicino1: mappa.get(pair.value).vicini)
                {
                    if (vicino1 != indice && !ris.contains(vicino1) && !mappa.get(vicino1).presentePokemon)
                    {
                        ris.add(vicino1);
                        daVisitare.add(new Pair(pair.key + 1, vicino1));
                    }
                }
            }

            return ris;
        }
}
