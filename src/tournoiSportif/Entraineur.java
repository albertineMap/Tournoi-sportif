package tournoiSportif;

public class Entraineur extends Joueur{

    public Entraineur(String nom, String prenom, String age, String nbMatchJoue, String salaire, Equipe equipe) {
        super(nom, prenom, Integer.parseInt(age), Integer.parseInt(nbMatchJoue), Float.parseFloat(salaire), equipe);
    }
}
