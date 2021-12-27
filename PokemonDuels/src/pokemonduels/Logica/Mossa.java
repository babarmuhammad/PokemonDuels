/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

/**
 *
 * @author babar_muhammad_anas
 */
public class Mossa {

   
  
    public Integer percentuale, danno,id;
    public String descrizione,nome,colore;
    
     public Mossa(Integer id, Integer percentuale, Integer danno, String descrizione, String nome) {
        this.id = id;
        this.percentuale = percentuale;
        this.danno = danno;
        this.descrizione = descrizione;
        this.nome = nome;
        this.colore=colore;
    }
     public void fromCSV(String csv){
         String[] campo=csv.split(";");
         id=Integer.parseInt(campo[0]);
         nome=campo[1];
         colore=campo[2];
         descrizione=campo[3];
         danno=Integer.parseInt(campo[4]);
         percentuale=Integer.parseInt(campo[5]);
     }
     
    @Override
     public String toString(){
     return nome+";"+percentuale+";"+danno;
     }
}
