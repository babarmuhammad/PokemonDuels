/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonduels.Logica;

import javax.swing.Timer;

/**
 *
 * @author ludov
 */
public class Attacco {
     public Nodo Mio,Avversario;
        public Mossa MossaMia, MossaAvversario;
        public Attacco(Nodo Mio, Nodo Avversario, Mossa MossaMia, Mossa MossaAvversario)
        {
            this.Mio = Mio;
            this.Avversario = Avversario;
            if (MossaMia != null)
                this.MossaMia = (Mossa)MossaMia;
            else
                this.MossaMia = null;
            if (MossaAvversario != null)
                this.MossaAvversario = (Mossa)MossaAvversario;
            else
                this.MossaAvversario = null;
        }
        public boolean Settato()
        {
            if (Mio != null && Avversario != null && MossaMia != null && MossaAvversario != null)
                return true;
            return false;
        }
      

}
