/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetefavoritos;

/**
 *
 * @author luis
 */
public class Favorito {
    private String url, texto;

    public Favorito(String url, String texto) {
        this.url = url;
        this.texto = texto;
    }

    public String getUrl() {
        return url;
    }

    public String getTexto() {
        return texto;
    }
    
}
