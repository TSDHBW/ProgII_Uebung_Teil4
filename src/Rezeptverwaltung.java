public class Rezeptverwaltung {

    public BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void zeigeRezeptAn (String rezeptname, String rezeptart){


    }

    public int ermittleAnzahlRezepte (String rezeptart){

        return 0;

    }

    public void sucheRezeptNachZutat (Zutat zutat){


    }

    public void nehmeRezeptAuf (BasisRezept rezept){

        boolean rezeptAufgenommen = false;
        for (int i = 0; i < rezepte.length; i++) {

            if (rezepte[i] == null){

                rezepte[i] = rezept;
                System.out.println("Rezept aufgenommen");
                rezeptAufgenommen = true;
                break;

            }
        }
        if (rezeptAufgenommen == false){
            System.out.println("Rezept konnte nicht aufgenommen werden");
        }
    }

}
