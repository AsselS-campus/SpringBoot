package com.example.demo.dao;

import com.example.demo.model.Personnage;

import java.util.List;

public interface PersonnageDao {
   List<Personnage> findAll();
   Personnage findById(int id);
   void save(Personnage personnage);
   void delete(int id);
   boolean PersonnageUpdate(Personnage personnage);


}