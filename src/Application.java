
public class Application {

	public static void main(String[] args) {
		// Cr�ation de l'instance CuisineSimplon de la class Cuisine
		
		Cuisine cuisineSimplon = new Cuisine();
		
		cuisineSimplon.tasse = " tasse en porcelaine";
		cuisineSimplon.nom = "Sadoun";
		cuisineSimplon.pr�nom = "Hamed";
		
		
		// On appelle la m�thode "machineCaf�" de l'instance "cuisineSimplon" de la Class "Cuisine" et on stock son r�sultat 
		String caf� = cuisineSimplon.machineCaf�("arabica ","eau de javel ", "on");
		
		System.out.println(caf�);
		
		//Cr�ation d'une instance pour Pierre caf� colombien, cristalline, tasse Peter Pan
		
		Cuisine cuisinePierre = new Cuisine();
		cuisinePierre.nom = "Pierre";
		cuisinePierre.tasse = " Peter Pan";
		
		String caf�2 = cuisinePierre.machineCaf�(" colombien ", " cristalline", " on");
		System.out.println(caf�2);
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.nom = "Athanasia";
		cuisineAthanasia.tasse = " TinkerBell";
		String caf�3 = cuisineAthanasia.machineCaf�(" arabica ", " volvic", " on");
		System.out.println(caf�3);
		
		Cuisine cuisineLloyds = new Cuisine();
		cuisineLloyds.nom = "Lloyds";
		cuisineLloyds.tasse = " Solid Snake";
		String caf�4 = cuisineLloyds.machineCaf�(" th�", " eau de toilette",  " on");
		System.out.println(caf�4);
	}

}