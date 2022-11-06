package com.abir.produits1;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abir.produits1.entities.Categorie;
import com.abir.produits1.entities.Produit;
import com.abir.produits1.repos.ProduitRepository;

@SpringBootTest
class Produits1ApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	/*
	public void testCreateProduit() {
	Produit prod = new Produit("PC Asus",4200.00,new Date());
	produitRepository.save(prod);
	}
	
	
	@Test
	public void testFindByNomProduit()
	{
	List<Produit> prods = produitRepository.findByNomProduit("PC Lenovo");

	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Produit> prods=produitRepository.findByNomProduitContains("Lenovo");

	for (Produit p : prods)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("PC Lenovo", 1000.00);
	for (Produit p : prods)
	{
	System.out.println(p);
	
	}}
	
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	List<Produit> prods = produitRepository.findByCategorie(cat);
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void findByCategorieIdCat()
	{
	List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Produit> prods =

	produitRepository.findByOrderByNomProduitAsc();
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}*/
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	}
