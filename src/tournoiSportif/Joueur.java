package tournoiSportif;

import java.util.ArrayList;

public class Joueur {

    //Variable

    private int id;
    private String nom;
    String prenom;
    private int age;
    private int nbButMarque;
    private int nbMatchJoue;
    private int nbCartonJaune;
    private int nbCartonRouge;
    private float salaire;
    private Equipe equipe;
    public static int compteur=0;

    /**
     * Constructeur avec nom,prenom
     * id est identifiant du joueur et est incremente par la variable static
     * @param nom
     * @param prenom
     * @param age
     */
    public Joueur(String nom, String prenom, String age) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = 1000000;
        this.nbButMarque = 0;
        this.nbCartonJaune = 0;
        this.nbCartonRouge=0;
        try{
            this.age = Integer.parseInt(age);
        }catch (Exception e){
            System.out.println("Erreur sur l'age': Entree invalide");
        }
    }

    /**
     * constructeur avec tous les parametres
     * id est identifiant du joueur et est incremente par la variable static
     * @param nom
     * @param prenom
     * @param age
     * @param nbMatchJoue
     * @param salaire
     * @param equipe
     */
    public Joueur(String nom, String prenom, int age, int nbMatchJoue, float salaire, Equipe equipe) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.nbMatchJoue = nbMatchJoue;
        this.salaire = salaire;
        this.equipe = equipe;
    }

    // getter et setter

    public int getNbCartonJaune() {
        return nbCartonJaune;
    }

    public void setNbCartonJaune() {
        this.nbCartonJaune = this.getNbCartonJaune() + 1;
    }

    public int getNbCartonRouge() {
        return nbCartonRouge;
    }

    public void setNbCartonRouge(int nbCartonRouge) {
        this.nbCartonRouge = this.getNbCartonRouge() +1;
    }

    public int getNbMatchJoue() {
        return nbMatchJoue;
    }

    public void setNbMatchJoue(String nbMatchJoue) {
        try{
            this.nbMatchJoue = Integer.parseInt(nbMatchJoue);
        }catch (Exception e){
            System.out.println("Erreur sur le nombre de match joué: Entree invalide");
        }
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        try{
            this.salaire = Float.parseFloat(salaire);
        }catch (Exception e){
            System.out.println("Erreur sur le salaire: Entree invalide");
        }
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void marquerLeBut(){
        this.nbButMarque ++;
    }

    //Methodes

    /**
     * Cette methode permet d'ajouter un joueur a la liste des Joueurs
     * @param id = le joueur qu'on veut ajouter
     * @return void
     */
    public Joueur trouver(int  id, ArrayList<Joueur> listeDesjoueurs) {
        Joueur joueur = null;
        //si la liste des joeurs est vide
        if(listeDesjoueurs.isEmpty()){
            System.out.println("La liste vide!!");
        }else{
            for (Joueur j : listeDesjoueurs) {
                if(j.id == id){
                    joueur = j;
                }
            }
        }
        return joueur;
    }

    /**
     * Cette methode permet d'ajouter un joueur a la liste des Joueurs
     * @param joueur = le joueur qu'on veut ajouter
     * @return void la methode ne retourne rien car elle permet juste de faire l'ajout.
     */
    public void inserer(Joueur joueur,  ArrayList<Joueur> listeDesjoueurs) {
        listeDesjoueurs.add(joueur);
    }

    /**
     * Cette methode permet de supprimer un joueur de la liste des Joueurs
     * @param joueur :joueur qu'on veut supprimer
     * @return void
     */
    public void supprimer(Joueur joueur,  ArrayList<Joueur> listeDesjoueurs) {

        //si la liste des joeurs est vide
        if(listeDesjoueurs.isEmpty()){
            System.out.println("Erreur de suppression: Liste vide!!");
        }else{
            for (Joueur j : listeDesjoueurs) {
                if(j.id == joueur.id){
                    listeDesjoueurs.remove(joueur);
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
        String joueur = "**********************";
        joueur += "\nNom : " + nom;
        joueur += "\nPreNom : " + prenom;
        joueur += "\nEquipe : " + equipe.nom;
        return joueur;
    }
}
