
package sos.animaux.entities;

import javax.xml.crypto.Data;

public class Facture {
    private int id_facture;
    private String service;
    private float montant;
    private Data date;

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public Facture(String service, float montant, Data date) {
        this.service = service;
        this.montant = montant;
        this.date = date;
    }



}
