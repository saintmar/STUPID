// Exemple d'utilisation
package edu.uga.miage.m1;

public class Main {
    public static void main(String[] args) {
        Inventaire inventaire = Inventaire.getInstance();
        inventaire.ajouterProduit("Stylo", 50);
        inventaire.ajouterProduit("Cahier", 30);

        Commande commande = new Commande(inventaire);
        commande.passerCommande("Stylo", 10);
        commande.afficherInventaireApresCommande();
        commande.afficherCommandeAvecTVA();
    }
}
