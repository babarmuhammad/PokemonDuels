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
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;


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
        public void DisegnaMappa(){
           
            
                    }
}
         
        

