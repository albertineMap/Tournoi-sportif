package tournoiSportif;

import java.util.ArrayList;

public class Equipe {

    public static final int NOMBRE_GARDIENS = 2;
    public static final int NOMBRE_JOUEURS = 23;
    private int id;
    String nom;
   // int nombreDeJoueur;
    float budjetMax;
    public static int compteur=0;
    public static ArrayList<Joueur> listeDesjoueurs = new ArrayList<Joueur>();


    // Constructeur

    /**
     *
     * @param nom
     * @param budjetMax
     */
    public Equipe(String nom, String budjetMax) {
        this.nom = nom;
        this.id = ++compteur;
        try{
            this.id = compteur++;
            this.budjetMax = Float.parseFloat(budjetMax);
        }catch (Exception e){
            System.out.println("Entree invalide");
        }
    }


    //Methodes

    /**
     * Cette methode permet d'ajouter une équipe a la liste des équipes
     * @param equipe = l'équipe qu'on veut ajouter
     * @return void
     */
    public void inserer(Equipe equipe, ArrayList<Equipe> listeDesEquipes) {
        listeDesEquipes.add(equipe);
    }

    /**
     * Cette methode permet de supprimer une equipe de la liste des equipes
     * @param equipe :equipe qu'on veut supprimer
     * @return void
     */
    public void supprimer(Equipe equipe, ArrayList<Equipe> listeDesEquipes) {

        //si la liste des joeurs est vide
        if(listeDesEquipes.isEmpty()){
            System.out.println("Erreur de suppression: Liste vide!!");
        }else{
            for (Equipe e : listeDesEquipes) {
                if(e.id == equipe.id){
                    listeDesEquipes.remove(equipe);
                }
            }
        }
    }

    /**
     * affiche les informations du joueur
     * @return String
     */
    @Override
    public String toString() {
        String equipe = "**********************";
        equipe += "\nNom : " + nom;
        equipe += "\nNombre de Joueurs : " + NOMBRE_JOUEURS;
        equipe += "\nBudjetMax : " + budjetMax;
        return equipe;
    }

    /**
     * Cette methode cree et retourne une liste de joueur
     * @return ArrayList<Joueur>
     */
    public  ArrayList<Joueur> getListJoueurs(){

        //Creation des joueurs
        Attaquant attaquant1 = new Attaquant( "John","Query","26");
        Attaquant attaquant2 = new Attaquant( "Ginger","Bread","20");
        Defenseur defenseur1 = new Defenseur( "Thomas","Year","21");
        Defenseur defenseur2 = new Defenseur( "Kirk","Gislain","21");
        MilieuTerrain milieuTerrain1 = new MilieuTerrain( "Sun","Bertin","25");
        MilieuTerrain milieuTerrain2 = new MilieuTerrain( "Eric","Proud","29");
        Gardien gardien1 = new Gardien( "Gislain","Eli","23");
        Gardien gardien2 = new Gardien( "Bob","Eponge","22");
        //Attaquant Entraineur = new Attaquant( "Eleven","Bright","24");

        //Ajout dans la liste
        listeDesjoueurs.add(attaquant1);
        listeDesjoueurs.add(attaquant1);
        listeDesjoueurs.add(defenseur1);
        listeDesjoueurs.add(defenseur1);
        listeDesjoueurs.add(milieuTerrain1);
        listeDesjoueurs.add(milieuTerrain1);
        listeDesjoueurs.add(gardien1);
        listeDesjoueurs.add(gardien1);
       // listeDesjoueurs.add(Entraineur);

        return listeDesjoueurs;
    }

}
