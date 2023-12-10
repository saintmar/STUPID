/*package edu.uga.miage.m1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInventaireEtCommande {

    @Test
    public void testAjouterProduit() {
        Inventaire inventaire = new Inventaire();
        inventaire.ajouterProduit("Stylo", 50);
        assertEquals(50, inventaire.getQuantiteProduit("Stylo"));
    }

    @Test
    public void testRetirerProduit() {
        Inventaire inventaire = new Inventaire();
        inventaire.ajouterProduit("Stylo", 50);

        // Retirer 10 stylos
        inventaire.retirerProduit("Stylo", 10);
        assertEquals(40, inventaire.getQuantiteProduit("Stylo"));

        // Retirer plus que la quantité disponible
        inventaire.retirerProduit("Stylo", 50);
        assertEquals(40, inventaire.getQuantiteProduit("Stylo"));
    }

    @Test
    public void testPasserCommande() {
        Inventaire inventaire = new Inventaire();
        inventaire.ajouterProduit("Stylo", 50);

        Commande commande = new Commande(inventaire);
        commande.passerCommande("Stylo", 10);

        assertEquals(40, inventaire.getQuantiteProduit("Stylo"));
    }
}
*/
