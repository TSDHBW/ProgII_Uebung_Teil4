public class Rezeptverwaltung {

    public PastaGericht[] pastaRezepte;
    public FleischGericht[] fleischRezepte;
    public Cocktail[] cocktailRezepte;
    public Limonade[] limonadeRezepte;

    public Rezeptverwaltung (){

        pastaRezepte = new PastaGericht[1000];
        fleischRezepte = new FleischGericht[1000];
        cocktailRezepte = new Cocktail[1000];
        limonadeRezepte = new Limonade[1000];

    }

    public void zeigeRezeptAn (String rezeptname, String rezeptart){


    }

    public int ermittleAnzahlRezepte (String rezeptart){

        return 0;

    }

    public void sucheRezeptNachZutat (Zutat zutat){


    }

}
