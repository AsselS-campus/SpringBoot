package com.example.demo.dao;

import com.example.demo.model.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository est une annotation Spring pour indiquer que la classe est un bean, et que son rôle est de communiquer avec une source de données
// (en l'occurrence la base de données).

//
@Repository
public interface PersonnageDao extends JpaRepository<Personnage,Integer> {
   List<Personnage> findAll();
   Optional<Personnage> findById(Integer id);
   Personnage save(Personnage personnage);
   void deleteById(Integer id);

}