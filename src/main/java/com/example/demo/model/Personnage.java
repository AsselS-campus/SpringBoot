package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//Création du modèle Entity
//Cela dit à Hibernate de créer une table à partir de cette classe

public class Personnage {

    public enum PersonnageType {
        GUERRIER,
        MAGE,
        VOLEUR
    }

 //Ces annotations permettent pour que l'id soit identifié en tant que clé unique auto-générée
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private int hp; //hint point
    private PersonnageType type;

    public PersonnageType getType() {
        return type;
    }

    public void setType(PersonnageType type) {
        this.type = type;
    }

    public Personnage(){}

    public Personnage(Integer id, String nom, int hp, PersonnageType type) {
        this.id = id;
        this.nom = nom;
        this.hp = hp;
        this.type=type;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    @Override
    public String toString() {
        return "Personnage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", hp=" + hp +
                ", type='" + type + '\'' +
                '}';
    }
}
