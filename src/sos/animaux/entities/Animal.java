

package sos.animaux.entities;
public class Animal {
private int id_animal;
private String Nom_Animal;
private String type;
private int age;
private String etat;

    public Animal() {
        
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId_Animal() {
        return id_animal;
    }

    public void setId_Animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getage_Animal() {
        return age;
    }

    public void setage_Animal(int age) {
        this.age = age;
    }
    public String getNom_Animal() {
        return Nom_Animal;
    }

    public void setNom_Animal(String nom) {
        this.Nom_Animal = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal( String nom, String type,int age, String etat) {   
        this.Nom_Animal = nom;
        this.type = type;
        this.age =age;
        this.etat = etat;
    }


}
