package tournoiSportif;

public class MilieuTerrain extends Joueur{

    private int endurance;


    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param age
     */
    public MilieuTerrain(String nom, String prenom, String age) {
        super(nom, prenom, age);
        this.endurance = 0;
    }

    //getter
    public int getEndurance () {
        return endurance;
    }

    //setter
    public void setEndurance (String endurance) {
        try{
            this.endurance = Integer.parseInt(endurance);

        }catch (Exception e){
            System.out.println("donnée invalide");
        }
    }
}
