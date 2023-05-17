package com.fatma.fruits.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatma.fruits.entities.Fruit;
import com.fatma.fruits.entities.Saison;
import com.fatma.fruits.repos.FruitRepository;
import com.fatma.fruits.repos.ImageRepository;

@Service
public class FruitServiceImpl implements Fruitservice{
    @Autowired
	FruitRepository fruitrepository;
    @Autowired
     ImageRepository imageRepository;
	
	@Override
	public Fruit saveFruit(Fruit f) {
		// TODO Auto-generated method stub
		return fruitrepository.save(f);
	}

	/*@Override
	public Fruit updateFruit(Fruit f) {
		return fruitrepository.save(f);
	}*/



	@Override
	public Fruit updateFruit(Fruit f) {
	//Long oldProdImageId =this.getFruit(f.getIdFruit()).getImage().getIdImage();
  //   Long newProdImageId = f.getImage().getIdImage();
	Fruit fruiUpdated = fruitrepository.save(f);
	//if (oldProdImageId != newProdImageId) //si l'image a été modifiée
	//imageRepository.deleteById(oldProdImageId);
	return fruiUpdated;
	}

	@Override
	public void deleteFruit(Fruit f) {
		fruitrepository.delete(f);
		
	}

	@Override
	public void deleteFruitById(Long id) {
		fruitrepository.deleteById(id);
		
	}
	/*@Override
	public void deleteFruitById(Long id) {
	 Fruit p = getFruit(id);
	 //suuprimer l'image avant de supprimer le produit
	try {
	Files.delete(Paths.get(System.getProperty("user.home")+"/Pictures/"+p.getImagePath()));
	} catch (IOException e) {
	e.printStackTrace();
	}
	fruitrepository.deleteById(id);
	}*/

	
	
	@Override
	public Fruit getFruit(Long id) {
		return fruitrepository.findById(id).get();
		
	}

	@Override
	public List<Fruit> getAllFruits() {
		// TODO Auto-generated method stub
		return fruitrepository.findAll();
	}

	@Override
	public List<Fruit> findByNomFruits(String nom) {
		// TODO Auto-generated method stub
		return fruitrepository.findByNomFruit(nom);
	}

	@Override
	public List<Fruit> findByNomFruitsContains(String nom) {
		// TODO Auto-generated method stub
		return fruitrepository.findByNomFruitContains(nom);
	}

	@Override
	public List<Fruit> findByNomPrix(String nom, double prix) {
		// TODO Auto-generated method stub
		return fruitrepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Fruit> findBySaison(Saison saison) {
		// TODO Auto-generated method stub
		return fruitrepository.findBySaison(saison);
	}

	@Override
	public List<Fruit> findBySaisonIdSai(Long id) {
		// TODO Auto-generated method stub
		return fruitrepository.findBySaisonIdSai(id);
	}

	@Override
	public List<Fruit> findByOrderByNomFruitDesc() {
		// TODO Auto-generated method stub
		return fruitrepository.findByOrderByNomFruitDesc();
	}

	@Override
	public List<Fruit> trierFruitsNomsPrix() {
		// TODO Auto-generated method stub
		return fruitrepository.trierFruitsNomsPrix();
	}

}
