public abstract class BasisRezept {

    public String name;
    public Zutat[] zutaten;

    public BasisRezept(String name, Zutat[]zutaten){

        this.name = name;
        this.zutaten = zutaten;

    }

    public void zubereiten (int anzahlPortionen){

    }
}
