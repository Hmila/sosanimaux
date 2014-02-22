/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sos.animaux.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sos.animaux.connection.MyConnection;
import sos.animaux.entities.Animal;
/**
 *
 * @author Karray
 */
public class AnimalDAO {

     public void insertAnimal(Animal d){

        String requete = "insert into Animal (Nom_Animal,type,age,etat) values (?)";
           
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNom_Animal());
            ps.setString(2, d.getType());
             ps.setInt(3, d.getage_Animal());
             ps.setString(4, d.getEtat());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateAnimal(Animal d){
        String requete = "update Animal set Nom_Animal=? where id_Animal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getNom_Animal());
            ps.setInt(2, d.getId_Animal());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteAnimal(int id){
        String requete = "delete from pays where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Pays supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Animal findAnimalById(int id){
    Animal A = new Animal();
     String requete = "select * from Animal where id_Animal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                A.setId_Animal(resultat.getInt(1));
                A.setNom_Animal(resultat.getString(2));
            }
            return A;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du animal "+ex.getMessage());
            return null;
        }
    }

    public Animal findAnimalByAdresse(String adr){
    Animal A = new Animal();
     String requete = "select * from Animal where Nom_Animal = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, adr);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                A.setId_Animal(resultat.getInt(1));
                System.out.println("testttttttt"+A.getId_Animal());
                A.setNom_Animal(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return A;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'animal "+ex.getMessage());
            return null;
        }
    }

    public List<Animal> DisplayAllAnimal (){


        List<Animal> listeAnimal = new ArrayList<Animal>();

        String requete = "select * from Animal";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Animal A =new Animal();
                A.setId_Animal(resultat.getInt(1));
                A.setNom_Animal(resultat.getString(2));

                listeAnimal.add(A);
            }
            return listeAnimal;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des animaux "+ex.getMessage());
            return null;
        }
    }

}
