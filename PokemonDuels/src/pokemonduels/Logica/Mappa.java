/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.List;
import java.util.Timer;
import pokemonduels.Grafica.Grafica;

/**
 *
 * @author babar_muhammad_anas
 */
public class Mappa {
    public List<Nodo> mappa;
        Integer Destinazione;
        boolean turno;
        List<Integer> startPosizionamento;
        Canvas myCanvas;
        Grafica m;
        int partiX, partiY;
        List<Rectangle> Grafica;
        int PartiPerMano;
        int PedineMappa,PedineMano;
        Nodo Selezionato;
        int Nturno,Tvinti;
        public Giocatore io, altro;
        //public Ruota r;
        //GestioneRuota gr;
        public int mioAttacco;
        Timer t;
}
