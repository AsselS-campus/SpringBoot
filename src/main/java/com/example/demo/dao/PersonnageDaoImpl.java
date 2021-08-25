package com.example.demo.dao;

import com.example.demo.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Nous allons nous rapprocher un peu plus d'un cas d'utilisation réel en créant la DAO (data access object ) nécessaire pour communiquer avec une base de données.
// Nous allons simuler celle-ci grâce à des données statiques.

//Normalement , cette classe est censée communiquer avec la base de données pour récupérer les personnages ou en ajouter.
// Nous allons simuler ce comportement en créant des Personnages en dur dans le code.
//Objet d'accès aux données
@Repository
public class PersonnageDaoImpl implements PersonnageDao {
    public static List<Personnage>personnages=new ArrayList<>();
    static {
        personnages.add(new Personnage(1,"Jason", 110, "guerrier"));
        personnages.add(new Personnage(2,"Mike", 200, "guerier"));
        personnages.add(new Personnage(3,"Florian", 300, "magicien"));

    }

    @Override
    public List<Personnage> findAll() { //findAll  : renvoie tous les produits que nous avons créés ;
        return personnages;
    }

    @Override
    public Personnage findById(int id) { //findById : vérifie s'il y a un produit avec l'id donnée dans notre liste de produits et le renvoie en cas de correspondance ;
        for (Personnage personnage:personnages){
            if(personnage.getId()==id){
                return  personnage;
            }
        }
        return null;
    }

    public void save(Personnage personnage) { //save : ajoute le personnage reçu à notre liste.
        personnages.add(personnage);
    }

    @Override
    public void delete(int id) {
        personnages.remove(this.findById(id));
    }

    @Override
    public boolean PersonnageUpdate(Personnage personnage) {
            Personnage  personnage1 = this.findById(personnage.getId());
            personnage1.setNom( personnage.getNom());
            personnage1.setType( personnage.getType());

            return true;
    }
}
