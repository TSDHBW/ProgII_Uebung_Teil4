public class Rezeptverwaltung {

    public BasisRezept[] rezepte;

    public Rezeptverwaltung (){

        rezepte = new BasisRezept[1000];

    }

    public void zeigeAlleRezepteAn () {

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                System.out.println(rezepte[i].name);

            }
        }

    }

    public int ermittleAnzahlRezepte (String rezeptart){

        int anzahl = 0;

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].typ.equals(rezeptart)){

                    anzahl++;

                }
            }
        }
        return anzahl;
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

    public void loescheRezept (String rezeptname, String rezeptart){

        for (int i = 0; i < rezepte.length; i++){

            if (rezepte[i] != null){

                if (rezepte[i].name.equals(rezeptname) && rezepte[i].typ.equals(rezeptart)){

                    rezepte[i] = null;

                }
            }
        }
    }

}
