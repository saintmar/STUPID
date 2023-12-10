package edu.uga.miage.m1;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Commande {

	Logger logger = Logger.getLogger(Commande.class.getName());
		
    private Inventaire inventaire;
    private Map<String, Article> articles;

    public Commande(Inventaire inventaire) {
        this.inventaire = inventaire;
        articles = new HashMap<>();
    }

    public void passerCommande(String nom, int quantite) {
    	logger.log(Level.INFO, () -> "Commande passée pour " + quantite + " unités de " + nom + ".");
        inventaire.retirerProduit(nom, quantite);
        articles.put(nom, new Article(nom, inventaire.getPrix(nom), quantite));
    }

    public void afficherInventaireApresCommande() {
        inventaire.afficherInventaire();
    }
    
    // Fonction pour afficher la facture avec la TVA
    public void afficherCommandeAvecTVA() {
        System.out.println("<<Command>>"); //NOSONAR
    	articles.values().forEach(a -> {
    			System.out.print("Produit: " + a.getNom() + ", Quantité: " + a.getQuantite()); //NOSONAR
        		System.out.print(", Prix (avant TVA): " + a.calculePrixTotal()); //NOSONAR
        		float prixTVA = a.calculePrixTotal() * 1.2f;
        		System.out.println(", Prix (après TVA): " + prixTVA); //NOSONAR
    		}
    	);
    }

    // Fonction pour afficher la facture sans la TVA
    public void afficherCommandeSansTVA() {
        System.out.println("<<Command>>"); //NOSONAR
    	articles.values().forEach(a -> {
        		System.out.print("Produit: " + a.getNom() + ", Quantité: " + a.getQuantite()); //NOSONAR
        		System.out.println(", Prix: " + a.calculePrixTotal()); //NOSONAR
    		}
    	);
    }
}
