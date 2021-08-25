package com.example.demo.model;//package com.example.demo.model;

public class Personnage {

    private int id;
    private String nom;
    private int hp; //hint point
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Personnage(int id, String nom, int hp, String type) {
        this.id = id;
        this.nom = nom;
        this.hp = hp;
        this.type=type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
