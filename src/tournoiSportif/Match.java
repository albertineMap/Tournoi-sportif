package tournoiSportif;

public class Match {
    private int id;
    private int numeroMatch;
    private int resultatEquipeUn;
    private int resultatEquipeDeux;
    private int nbCarton;
    private String date;
    private String lieu;
    private Equipe equipeUne;
    private Equipe equipeDeux;
    public static int compteur=0;
    private boolean butMarque;

    /**
     * Listedes differentes actions qu'on peut avoir lors d'un match de soccer
     */
    private enum Action {
        ATTAQUE,
        ENDURANCE,
        INTERCEPTION,
        ARRETTE_BUT,
        MARQUE_bUT,
        CONSEILLE_JOUEUR,
        CHANGE_JOUEUR
    }

    /**
     * constructeur avec tous les parametres
     * id est identifiant du joueur et est incremente par la variable static
     * @param numMatch
     * @param resultatEquipUn
     * @param resultatEquipDeux
     * @param nombreCarton
     * @param date
     * @param lieu
     * @param equipeUne
     * @param equipeDeux
     */
    public Match(String numMatch, String resultatEquipUn,String resultatEquipDeux, String nombreCarton, String date, String lieu, Equipe equipeUne, Equipe equipeDeux) {
        try{
            this.id = ++compteur;
            this.numeroMatch = Integer.parseInt(numMatch);
            this.resultatEquipeUn = Integer.parseInt(resultatEquipUn);
            this.resultatEquipeUn = Integer.parseInt(resultatEquipDeux);
            this.nbCarton = Integer.parseInt(nombreCarton);
            this.equipeUne = equipeUne;
            this.equipeDeux = equipeDeux;
        }catch (Exception e){
            System.out.println("donnée invalide");
        }

        this.date = date;
        this.lieu = lieu;
    }


}
