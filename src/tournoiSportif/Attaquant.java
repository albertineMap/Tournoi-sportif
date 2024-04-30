package tournoiSportif;

public class Attaquant extends Joueur
{
    private int attaque;

    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param age
     */
    public Attaquant(String nom, String prenom, String age) {
        super(nom, prenom, age);
        this.attaque = 0;
    }

    //getter
    public int getAttaque() {
        return attaque;
    }

    //setter
    public void setAttaque(String attaque) {
        try{
            this.attaque = Integer.parseInt(attaque);

        }catch (Exception e){
            System.out.println("donnée invalide");
        }
    }
}
