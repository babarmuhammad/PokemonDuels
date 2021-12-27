/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonduels.Logica;

import java.util.List;

/**
 *
 * @author babar_muhammad_anas
 */
public class Pokemon {
   public  Integer id;
   public String nome,urlImmagine;
   public Integer Salti;
   public List<Integer> Mosse;
   private Integer NMosse;
   
   
   public void fromCsv(String csv){
    String[]campo=csv.split(";");
    id=Integer.parseInt(campo[0]);
    nome=campo[1];
    Salti=Integer.parseInt(campo[2]);
    for(Integer i=0;i<Integer.parseInt(campo[3]);i++)
        Mosse.add(NMosse++);
    urlImmagine=id+"png";
        
}
}



