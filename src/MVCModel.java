public class MVCModel {

    Rezeptverwaltung rezeptverwaltung;

    public MVCModel(){

        init();

    }

    public void init(){

        rezeptverwaltung = new Rezeptverwaltung();
        System.out.println("Initialisieren des Datenmodells abgeschlossen");

    }

}
