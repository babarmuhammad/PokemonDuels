/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;
import pokemonduels.File.StoreInfo;
import pokemonduels.Grafica.Grafica;


/**
 *
 * @author babar_muhammad_anas
 */
public class Mappa {
    public List<Nodo> mappa;
        
        Integer Destinazione;
        boolean _turno;
        ArrayList<Integer> startPosizionamento;
        Integer partiX, partiY;
        Integer distanza = 0;
        List<Rectangle> Grafica;
        Integer PartiPerMano;
        Integer PedineMappa, PedineMano;
        Nodo Selezionato;
        Integer Nturno, Tvinti;
        //GestioneRuota gr;
        public Integer mioAttacco;
        Integer turniAPartita = 3;
        private Object synTurno;
        ActionListener listener;
        Timer t = new Timer(0, listener);  
        Integer tempoRimasto=0;
        Label timer;
        
        public boolean turno;
            
        public void controllaTurno(){
            if(_turno){
                tempoRimasto = 80;
                t.start();
                    
            }
            else
                t.stop();
            
        }
        public static List<String> Leggi(String file)
        {
            List<String> righe = new ArrayList<String>();
            try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            
            while(line!=null) {
               righe.add(line);
               
            }
            reader.close();
            } catch (IOException ex) {
            Logger.getLogger(StoreInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return righe;
            
        }
         public void creaNodi()      //crea i nodi logici
        {
             
            List<String> righe = Leggi("Mappa.csv");
            String[] split = righe.get(0).split(";");
            partiX = Integer.parseInt(split[0]);
            partiY = Integer.parseInt(split[1]);
            split = righe.get(1).split(";");
            PartiPerMano = Integer.parseInt(split[1]);
            for (String s:  righe.get(2).split(";"))
                startPosizionamento.add(Integer.parseInt(s));
            int x = 0;
            for (int i = 0; i < partiY; i++)
            {
                String[] celle = righe.get(3 + PartiPerMano + i).split(";");
                for (int j = 0; j < celle.length; j++)
                    if (celle[j] == "1")
                    {
                        Nodo n = new Nodo();
                        n.x = j + 1;
                        n.y = i + PartiPerMano;
                        n.indice = x++;
                        mappa.add(n);
                    }
            }
            PedineMappa = x;
            for (int i = 0; i < PartiPerMano; i++)
            {
                String[] celle = righe.get(3 + i).split(";");
                for (int j = 0; j < celle.length; j++)
                    if (celle[j] == "1")
                    {
                        Nodo n = new Nodo();
                        n.x = j + 1;
                        n.y = i;
                        n.indice = x++;
                        mappa.add(n);
                    }
            }
            for (int i = 0; i < PartiPerMano; i++)
            {
                String[] celle = righe.get(3 + PartiPerMano + partiY + i).split(";");
                for (int j = 0; j < celle.length; j++)
                    if (celle[j] == "1")
                    {
                        Nodo n = new Nodo();
                        n.x = j + 1;
                        n.y = i + PartiPerMano + partiY;
                        n.indice = x++;
                        mappa.add(n);
                    }
            }
        }
          public void creaCollegamenti()      //crea i collegamenti logici
        {
            List<String> righe = Leggi("Collegamenti.csv");
            for (String s:  righe)
            {
                String[] estremi = s.split(";");
                Integer P = Integer.parseInt(estremi[0]);
                Integer F = Integer.parseInt(estremi[1]);
                mappa.get(P).vicini.add(F);
                mappa.get(F).vicini.add(P);
            }
        }
        public void DisegnaNodi(Grafica m)  
        {
            Integer[][] mariceMappa = new Integer[5][13];
            
        }  
        public void DisegnaMappa(){
           
            
                    }
}
         
        

