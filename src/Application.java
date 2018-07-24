
public class Application {

	public static void main(String[] args) {
		// Création de l'instance CuisineSimplon de la class Cuisine
		
		Cuisine cuisineSimplon = new Cuisine();
		
		cuisineSimplon.tasse = " tasse en porcelaine";
		cuisineSimplon.nom = "Sadoun";
		cuisineSimplon.prénom = "Hamed";
		
		
		// On appelle la méthode "machineCafé" de l'instance "cuisineSimplon" de la Class "Cuisine" et on stock son résultat 
		String café = cuisineSimplon.machineCafé("arabica ","eau de javel ", "on");
		
		System.out.println(café);
		
		//Création d'une instance pour Pierre café colombien, cristalline, tasse Peter Pan
		
		Cuisine cuisinePierre = new Cuisine();
		cuisinePierre.nom = "Pierre";
		cuisinePierre.tasse = " Peter Pan";
		
		String café2 = cuisinePierre.machineCafé(" colombien ", " cristalline", " on");
		System.out.println(café2);
		
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineAthanasia.nom = "Athanasia";
		cuisineAthanasia.tasse = " TinkerBell";
		String café3 = cuisineAthanasia.machineCafé(" arabica ", " volvic", " on");
		System.out.println(café3);
		
		Cuisine cuisineLloyds = new Cuisine();
		cuisineLloyds.nom = "Lloyds";
		cuisineLloyds.tasse = " Solid Snake";
		String café4 = cuisineLloyds.machineCafé(" thé", " eau de toilette",  " on");
		System.out.println(café4);
	}

}