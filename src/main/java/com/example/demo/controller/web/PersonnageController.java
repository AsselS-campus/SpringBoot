package com.example.demo.controller.web;
import com.example.demo.dao.PersonnageDao;
import com.example.demo.model.Personnage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.*;

@EnableSwagger2
@RestController
public class PersonnageController {
    //nous avons créé une variable de type ProductDao, que nous avons annotée avec @Autowired afin que Spring se charge d'en fabriquer
    // une instance. ProductDao a désormais accès à toutes les méthodes que nous avons définies.
    @Autowired
    private PersonnageDao personnageDao;


    //GET.Récupérer la liste des personnages
    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    //Dans ce code,  c'est l'annotation @RequestMapping  qui permet de faire le lien entre l'URI "/Personnages", invoquée via GET, et la méthode listePersonnages .
    public List<Personnage> listePersonnages() {
        return personnageDao.findAll();
    }

      //GET.Récupérer un personnage par son id
    @GetMapping(value = "/personnages/{id}")
    public Optional<Personnage> afficherUnPersonnage(@PathVariable Integer id) {
        return personnageDao.findById(id);
    }

    //POST.Ajouter un personnage
    @PostMapping(value="/personnages")
    public void ajouterPersonnage(@RequestBody Personnage personnage){
        personnageDao.save(personnage);
    }

    //Modifier un personnage
    @PutMapping(value="/personnages")
    public void modifierPersonnage(@RequestBody Personnage personnage){
        personnageDao.save(personnage);
    }

    //DELETE.Remove un personnage par son id
    @RequestMapping(value="/personnages/{id}",method = RequestMethod.DELETE)
    public void removeUnPersonnage(@PathVariable Integer id) {
         personnageDao.deleteById(id);
    }

//    //PUT
//    @RequestMapping(value= "/personnages/{id}", method = RequestMethod.PUT )
//    public boolean update(@PathVariable int id,@RequestBody Personnage personnage){
//        return personnageDao.PersonnageUpdate(personnage);
//    }
}



