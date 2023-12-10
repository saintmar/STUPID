package edu.uga.miage.m1;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


public class Inventaire {
	
	Logger logger = Logger.getLogger(Inventaire.class.getName());

    private Map<String, Float> prix;
    private Map<String, Integer> produits;
    private static Inventaire instance;

    private Inventaire() {
    	this.prix = new HashMap<>();
    	this.produits = new HashMap<>();
    	fillPrix();
    }
    
    public static Inventaire getInstance() {
    	if (instance == null) {
    		instance = new Inventaire();
    	}
    	return instance;
    }
    
    private void fillPrix() {
    	prix.put("Stylo", 2.3f);
    	prix.put("Cahier", 5.3f);
    }
    
    public float getPrix(String nom) {
    	return prix.get(nom);
    }

    public void ajouterProduit(String nom, int quantite) {
        if (produits.containsKey(nom)) {
            produits.put(nom, produits.get(nom) + quantite);
        } else {
            produits.put(nom, quantite);
        }
    }

    public void retirerProduit(String nom, int quantite) {
        if (produits.containsKey(nom) && produits.get(nom) >= quantite) {
            produits.put(nom, produits.get(nom) - quantite);
        } else {
            logger.info("Produit non disponible en quantité suffisante.");
        }
    }

    public void afficherInventaire() {
    	System.out.println("<<Inventaire>>"); //NOSONAR 
        for (Map.Entry<String, Integer> entry : produits.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue()); //NOSONAR 
        }
    }
}