package com.fatma.fruits.service;

import java.util.List;

import com.fatma.fruits.entities.Fruit;
import com.fatma.fruits.entities.Saison;

public interface Fruitservice {
Fruit saveFruit(Fruit f);
Fruit updateFruit(Fruit f);
void deleteFruit(Fruit f);
void deleteFruitById(Long id);
Fruit getFruit(Long id);
List<Fruit> getAllFruits();


List<Fruit> findByNomFruits(String nom);
List<Fruit> findByNomFruitsContains(String nom);
List<Fruit> findByNomPrix(String nom,double prix);
List<Fruit> findBySaison(Saison saison);
List<Fruit> findBySaisonIdSai(Long id);
List<Fruit>  findByOrderByNomFruitDesc();
List<Fruit>  trierFruitsNomsPrix();
}
