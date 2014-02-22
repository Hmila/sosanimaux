

package sos.animaux.entities;

import java.util.Date;


public class Declaration {

    private int id_declaration;
    private Date date;
    private String type_animal;
    private String etat_animal;

    public int getId_declaration() {
        return id_declaration;
    }

    public void setId_declaration(int id_declaration) {
        this.id_declaration = id_declaration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtat_animal() {
        return etat_animal;
    }

    public void setEtat_animal(String etat_animal) {
        this.etat_animal = etat_animal;
    }

    public String getType_animal() {
        return type_animal;
    }

    public void setType_animal(String type_animal) {
        this.type_animal = type_animal;
    }

    public Declaration( Date date, String type_animal, String etat_animal) {
        this.date = date;
        this.type_animal = type_animal;
        this.etat_animal = etat_animal;
    }

    

}
