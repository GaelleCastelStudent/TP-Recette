import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gaellecastel
 *
 */
public class MainRecettes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// déclaration d'une collection d'Aliments
		ArrayList<Aliment> listeAliments = new ArrayList<Aliment>();
		ArrayList<Type> listeTypes = new ArrayList<Type>();
		
		// initialisation de la liste des types
		listeTypes.add(new Type (1,"Entrée"));
		listeTypes.add(new Type (2,"Plat"));
		listeTypes.add(new Type (1,"Dessert"));
		
		String reponse="O" ;
		int choix=0;
		while (reponse.compareTo("O")==0) { 
			// menu
			do {
				System.out.println("----GESTION DES RECETTES----");
				System.out.println("1 - Créer un aliment");
				System.out.println("2 - Créer une recette");
				System.out.println("3 - Afficher les recettes") ;
				System.out.println("4 - Afficher les aliments") ;
				System.out.println("0 - Quitter");
				System.out.println("Quel est votre choix ? ");
				choix = sc.nextInt();
			} while (choix<=0 && choix>=4) ;
			
			//variables du switch
			int idAliment ;
			String nomAliment ;
			double calories ;
			
			// traitement du choix
			switch (choix) {
				case 0 :	System.out.println("Au revoir !") ;
							break ;
							
				case 1 :	// ------------------création d'un aliment---------------------
							// saisie des informations nécessaires
							System.out.println("Entrer l'identifiant de l'aliment") ;
							idAliment = sc.nextInt() ;
							System.out.println("Entrer le nom de l'aliment") ;
							nomAliment = sc.next() ;
							System.out.println("Entrer le nombre de calories de l'aliment") ;
							calories = sc.nextDouble() ;
							// ajout à la collection listeAliments du main
							listeAliments.add(new Aliment(idAliment, nomAliment, calories)) ;
							
							break ;
							
				case 2 :	// ------------------création d'une recette---------------------
							int idRecette, niveauDifficulte;
							String nomRecette; 
							double  tempsPreparation, tempsCuisson;
							System.out.println("Entrer l'identifiant de la recette") ;
							idRecette = sc.nextInt() ;
							System.out.println("Entrer le nom de la recette") ;
							nomRecette = sc.next() ;
							System.out.println("Entrer le temps de préparation de la recette") ;
							tempsPreparation = sc.nextDouble() ;
							System.out.println("Entrer le temps de cuisson de la recette") ;
							tempsCuisson = sc.nextDouble() ;
							System.out.println("Entrer le niveau de difficulté de la recette") ;
							niveauDifficulte = sc.nextInt() ;
							//private Type leType ; 
							//+ aliments
							break ;
							
				case 3 :	
							break ;
							
				case 4 :	// -----------------affichage des aliments créés-----------
							System.out.println("LISTE DES ALIMENTS");
							for (Aliment unAliment : listeAliments) {
								System.out.println(unAliment.toString());
							}
							break ;
					
				default : System.out.println("Erreur de saisie");
			}
			
			// continuer ?
			if (choix != 0) {
				do {
					System.out.println("Voulez-vous continuer ? (O/N)") ;
					reponse = sc.next();
				} while (reponse.compareTo("N")==0 || reponse.compareTo("0")==0) ;
			} else reponse="N";
			
			
		}

	}

}
