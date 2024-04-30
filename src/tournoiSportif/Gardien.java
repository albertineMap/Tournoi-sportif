package tournoiSportif;

public class Gardien extends Joueur{

    private int nbButEncaisses;
    private int nbPenaltyArrete;

    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param age
     */
    public Gardien(String nom, String prenom, String age) {
        super(nom, prenom, age);
        this.nbButEncaisses = 0;
    }

    public int getNbButEncaisses() {
        return nbButEncaisses;
    }

    //setter
    public void setNbButEncaisses(String nbButEncaisses) {
        try{
            this.nbButEncaisses = Integer.parseInt(nbButEncaisses);

        }catch (Exception e){
            System.out.println("donnée invalide");
        }
    }
}
