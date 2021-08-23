package com.example.demo.model;//package com.example.demo.model;

public class Personnage {
    // private int id;
    private String nom;
    private int hp; //hint point


    public Personnage(String nom, int hp) {
        this.nom = nom;
        //this.id=id;
        this.hp = hp;
    }


//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

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
        return "Product{" +
                //"id=" + id +
                ", nom='" + nom + '\'' +
                ", hp=" + hp +
                '}';
    }

}
