package com.example.demo.controller.web;

import com.example.demo.model.Personnage;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
//l'annotation @Controller de Spring qui permet de désigner une classe comme contrôleur, lui conférant la capacité de traiter les requêtes de type GET, POST, etc.
//@RestController est simplement la combinaison des deux annotations précédentes. Une fois ajouté, il indique que cette classe va pouvoir traiter les requêtes que nous allons définir. Il indique aussi que chaque méthode va renvoyer directement la réponse JSON à l'utilisateur, donc pas de vue dans le circuit.
public class PersonnageController {

    private static List<Personnage> liste_personnages = new ArrayList<>(
            Arrays.asList(
                new Personnage("Jason", 10),
                new Personnage("Mike Tyson", 35)
            )
    );

    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    //Dans ce code,  c'est l'annotation @RequestMapping  qui permet de faire le lien entre l'URI "/Produits", invoquée via GET, et la méthode listeProduits .
    public List<Personnage> listePersonnages() {
        return liste_personnages;
    }

    //Récupérer un produit par son nom
    @GetMapping(value = "/personnages/{param_name}")
    public Personnage afficherUnPersonnage(@PathVariable String param_name) {
        Personnage personnage = new Personnage(param_name, 100);
        return personnage;
    }
}

   

