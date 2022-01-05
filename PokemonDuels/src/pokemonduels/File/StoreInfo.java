/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokemonduels.Logica.Mossa;
import pokemonduels.Logica.Pokemon;

/**
 *
 * @author babar_muhammad_anas
 */
public class StoreInfo {
    public List<String> listMosse = new ArrayList<String>();
    public List<String> listPokemon = new ArrayList<String>();
    
    public void creaListaMosse() throws FileNotFoundException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Mosse.csv"));
            String line = reader.readLine();
            
            while(line!=null) {
                listMosse.add(line);
                line = reader.readLine();
            }       
            } catch (IOException ex) {
            Logger.getLogger(StoreInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void creaListaPokemon() throws FileNotFoundException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Pokemon.csv"));
            String line = reader.readLine();
            
            while(line!=null) {
                listPokemon.add(line);
                line = reader.readLine();
            }       
            } catch (IOException ex) {
            Logger.getLogger(StoreInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
