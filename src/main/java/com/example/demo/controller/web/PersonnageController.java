package com.example.demo.controller.web;

import com.example.demo.dao.PersonnageDao;
import com.example.demo.dao.PersonnageDaoImpl;
import com.example.demo.model.Personnage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//l'annotation @Controller de Spring qui permet de désigner une classe comme contrôleur, lui conférant la capacité de traiter les requêtes de type GET, POST, etc.
//@RestController est simplement la combinaison des deux annotations précédentes. Une fois ajouté, il indique que cette classe va pouvoir traiter les requêtes que nous allons définir. Il indique aussi que chaque méthode va renvoyer directement la réponse JSON à l'utilisateur, donc pas de vue dans le circuit.

@EnableSwagger2
@RestController
public class PersonnageController {
    //nous avons créé une variable de type ProductDao, que nous avons annotée avec @Autowired afin que Spring se charge d'en fabriquer
    // une instance. ProductDao a désormais accès à toutes les méthodes que nous avons définies.
    @Autowired
    private PersonnageDaoImpl personnageDao;

    //Récupérer la liste des personnages
    //GET
    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    //Dans ce code,  c'est l'annotation @RequestMapping  qui permet de faire le lien entre l'URI "/Personnages", invoquée via GET, et la méthode listePersonnages .
    public List<Personnage> listePersonnages() {
        return personnageDao.findAll();
    }

    //GET
    //Récupérer un personnage par son id
    @GetMapping(value = "/personnages/{id}")
    public Personnage afficherUnPersonnage(@PathVariable int id) {
        return personnageDao.findById(id);
    }

    //POST.Ajouter un personnage
    @PostMapping(value="/personnages")
    public void ajouterPersonnage(@RequestBody Personnage personnage){
        personnageDao.save(personnage);
    }

    //DELETE
    //Remove un personnage par son id
    @RequestMapping(value="/personnages/{id}",method = RequestMethod.DELETE)
    public void removeUnPersonnage(@PathVariable int id) {
         personnageDao.delete(id);
    }

    //PUT
    @RequestMapping(value= "/personnages/{id}", method = RequestMethod.PUT )
    public boolean update(@PathVariable int id,@RequestBody Personnage personnage){
        return personnageDao.PersonnageUpdate(personnage);
    }
}



