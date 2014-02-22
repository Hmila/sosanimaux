
package sos.animaux.entities;

import javax.xml.crypto.Data;

public class Offre {

private int id_offre;
private String service;
private Data date_debut;
private Data date_fin;
private float montant;

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Data getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Data date_debut) {
        this.date_debut = date_debut;
    }

    public Data getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Data date_fin) {
        this.date_fin = date_fin;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Offre(String service, Data date_debut, Data date_fin, float montant) {
        this.service = service;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.montant = montant;
    }


}
