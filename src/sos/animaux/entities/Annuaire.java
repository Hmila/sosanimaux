

package sos.animaux.entities;


public class Annuaire {

    private int id_annuaire;
    private String nom;
    private String prenom;
    private String adresse;
    private String service;
    private int tel;

    public int getId_annuaire() {
        return id_annuaire;
    }

    public void setId_annuaire(int id_annuaire) {
        this.id_annuaire = id_annuaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Annuaire(String nom, String prenom, String adresse, String service, int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.service = service;
        this.tel = tel;
    }

    

}
