package tournoiSportif;

import java.util.Random;

public class Defenseur extends Joueur{

    private int interception;
    Random rand = new Random();

    /**
     * Constructeur
     * @param nom
     * @param prenom
     * @param age
     */
    public Defenseur(String nom, String prenom, String age) {
        super(nom, prenom, age);
        this.interception = 0;
    }

    //getter
    public int getInterception() {
        return interception;
    }

    //setter
    public void setInterception(String interception) {
        try{
            this.interception = Integer.parseInt(interception);

        }catch (Exception e){
            System.out.println("donnée invalide");
        }
    }

    public void Intercepte(){
        this.interception = rand.nextInt(4);
    }
}
