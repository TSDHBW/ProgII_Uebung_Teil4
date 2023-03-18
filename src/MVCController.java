public class MVCController {

    MVCView view;
    MVCModel model;

    public MVCController(){

        this.view = new MVCView(this);
        this.model = new MVCModel();

        testeRezeptVerwaltung();

    }

    public void testeRezeptVerwaltung(){

        Zutat minze = new Zutat("Minze", 1.00);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat zucker = new Zutat("Zucker", 0.50);
        Zutat zitrone = new Zutat("Zitrone", 0.65);
        Zutat erdbeere = new Zutat("Erdbeere", 0.90);
        Zutat cola = new Zutat("Cola", 1.10);
        Zutat orange = new Zutat("Orange", 0.80);

        Zutat[] zutatenZitronenLimo = {minze, wasser, zitrone};
        Limonade zitronenLimo = new Limonade("Zitronenlimo", zutatenZitronenLimo, false, false, "Zitrone",true );

        Zutat[] zutatenOrangenLimo = {minze, wasser, orange};
        Limonade orangenLimo = new Limonade("Orangenlimo", zutatenOrangenLimo, false, false, "Zitrone",true );

        Zutat[] zutatenErdbeerLimo = {minze, wasser, erdbeere};
        Limonade erdbeerLimo = new Limonade("Erdbeerlimo", zutatenErdbeerLimo, false, false, "Zitrone",true );

        model.rezeptverwaltung.nehmeRezeptAuf(zitronenLimo);
        model.rezeptverwaltung.nehmeRezeptAuf(orangenLimo);
        model.rezeptverwaltung.nehmeRezeptAuf(erdbeerLimo);

        System.out.println(model.rezeptverwaltung.ermittleAnzahlRezepte("Limonade"));

        model.rezeptverwaltung.zeigeAlleRezepteAn();


    }

}
