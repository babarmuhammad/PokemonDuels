/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

import java.util.ArrayList;

/**
 *
 * @author babar_muhammad_anas
 */
public class Giocatore {
    public Integer Xp;
        public String Username;
        public int Materiali;
        public ArrayList<Pokemon> Deck;

        public Giocatore()
        {
            Xp = 0;
            Username = "";
            Materiali = 0;
            Deck = new ArrayList<Pokemon>();
        }
    }

