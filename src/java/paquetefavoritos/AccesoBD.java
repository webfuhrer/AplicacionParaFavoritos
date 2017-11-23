/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetefavoritos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public class AccesoBD {
    public static ArrayList<Favorito> recuperarFavoritos()
    {
      
        ArrayList<Favorito> lista=new ArrayList<>();
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/favoritos", "root", "");
            Statement stmt=c.createStatement();
            String sql="SELECT * FROM t_favoritos";
            ResultSet resultados=stmt.executeQuery(sql);
            while(resultados.next())
            {
                String texto=resultados.getString("texto");
                String url=resultados.getString("url");
                Favorito f=new Favorito(url, texto);
                lista.add(f);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

  static void insertarFavorito(Favorito f) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/favoritos", "root", "");
            Statement stmt=conexion.createStatement();
            String sql_insercion="INSERT INTO t_favoritos(texto, url) VALUES ('"+f.getTexto()+"', '"+f.getUrl()+"');";
            stmt.executeUpdate(sql_insercion);
            stmt.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

