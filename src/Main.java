public class Main {

    public static void main(String[] args) {

        Rezeptverwaltung rezeptverwaltung = new Rezeptverwaltung();

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

        rezeptverwaltung.nehmeRezeptAuf(zitronenLimo);
        rezeptverwaltung.nehmeRezeptAuf(orangenLimo);
        rezeptverwaltung.nehmeRezeptAuf(erdbeerLimo);

        System.out.println(rezeptverwaltung.rezepte[2].name);

        Person anto = new Person("Anto", "Pane", "Stuttgart", "14.04.79", 2500);
        Person karl = new Person("Karl", "Müller", "Sindelfingen", "25.02.92", 2000);
        Person mia = new Person("Mia", "Schwarz", "Gärtringen", "10.10.85", 2600);
        Person dieter = new Person("Dieter", "Müller", "Herrenberg", "14.07.70", 2450);

        Mitarbeiterverwaltung mitarbeiterverwaltung = new Mitarbeiterverwaltung();
        mitarbeiterverwaltung.mitarbeiter.put("ID1", anto);
        mitarbeiterverwaltung.mitarbeiter.put("ID2", karl);
        mitarbeiterverwaltung.mitarbeiter.put("ID3", mia);
        mitarbeiterverwaltung.mitarbeiter.put("ID4", dieter);

        System.out.println("Gehalt von Mia: " + mitarbeiterverwaltung.mitarbeiter.get("ID3").getGehalt());

    }

}
