import java.util.Random;

public class tietokonePelaaja extends Pelaaja{
    Random rnd = new Random();
    
    /**
     * Tulostetaan pelilauta.
     * Generoidaan satunnaisluku 1-9, kunnes luku vastaa vapaan ruudun numeroa. 
     * Asetetaan merkki vapaaseen ruutuun.
     * Päivitetään pelitilanne.
     */
    public void Pelaa(Pelilauta pelilauta) {
        pelilauta.tulostaLauta();
        System.out.println("Tietokonepelaaja asettaa merkin...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        seuraavaRuutu = rnd.nextInt(9)+1;
        while (pelilauta.annaPelatutRuudut().contains(seuraavaRuutu) == true) {
            seuraavaRuutu = rnd.nextInt(9)+1;
        }
        pelilauta.asetaMerkki(seuraavaRuutu);
        pelilauta.paivitaPelitilanne();
    }

    public void suljeScanner() {
    }
}