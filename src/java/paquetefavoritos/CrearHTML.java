package paquetefavoritos;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class CrearHTML {
 public static String crearLista(ArrayList<Favorito> lista_favoritos)
 {
     String html="<ol>";
     for(Favorito favorito: lista_favoritos)
     {
         String url=favorito.getUrl();
         String texto=favorito.getTexto();
         html+="<li><a href='"+url+"' target='_blank'>"+texto+"</a></li>";
     }
     html+="</ol>";
     return html;
 }
}
