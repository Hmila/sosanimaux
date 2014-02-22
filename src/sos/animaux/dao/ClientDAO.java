
package sos.animaux.dao;
import sos.animaux.entities.Client;
import sos.animaux.connection.MyConnection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
public class ClientDAO {

public void ajouterclient(Client c){
    String req = "insert into client(Nom,Prenom,Adresse,Tel,Mail,Login,Password) values ('"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"',"+c.getTel()+",'"+c.getMail()+"','"+c.getLogin()+"','"+c.getPassword()+"')";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            /*ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getAdresse());
            ps.setInt(4, c.getTel());
            ps.setString(5, c.getMail());
            ps.setString(6, c.getLogin());
            ps.setString(7, c.getPassword());*/
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
}
}
