package com.example.demo.dao;

import com.example.demo.model.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonnageDao extends JpaRepository<Personnage,Integer> {
   List<Personnage> findAll();
   Optional<Personnage> findById(Integer id);
   Personnage save(Personnage personnage);
   void deleteById(Integer id);
//   boolean PersonnageUpdate(Personnage personnage);


}