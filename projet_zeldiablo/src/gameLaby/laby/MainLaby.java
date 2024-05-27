package gameLaby.laby;

import moteurJeu.MoteurJeu;
import java.io.IOException;

public class MainLaby {

    public static void main(String[] args) throws IOException {
        int width = 800;
        int height = 800;
        int pFPS = 100;

        // creation des objets
        LabyJeu jeu = new LabyJeu();
        LabyDessin dessin = new LabyDessin();

        // parametrage du moteur de jeu
        MoteurJeu.setTaille(width,height);
        MoteurJeu.setFPS(pFPS);

        // lancement du jeu
        MoteurJeu.launch(jeu, dessin);
    }
}
