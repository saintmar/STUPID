package edu.uga.miage.m1;

public class Article {

	private final String nom;
	private final float prix;
	private final int quantite;
	
	public Article(String nom, float prix, int quantite) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public String getNom() {
		return nom;
	}

	
	public int getQuantite() {
		return quantite;
	}

	// Fonction pour calculer le prix total d'un article
    public float calculePrixTotal() {
    	return prix * quantite;
    }

}
