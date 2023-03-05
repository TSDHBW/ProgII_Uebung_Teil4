public abstract class BasisRezept {

    public String name;
    public Zutat[] zutaten;
    public String typ;

    public BasisRezept(String name, Zutat[]zutaten, String typ){

        this.name = name;
        this.zutaten = zutaten;
        this.typ = typ;

    }

    public void zubereiten (int anzahlPortionen){

    }
}
