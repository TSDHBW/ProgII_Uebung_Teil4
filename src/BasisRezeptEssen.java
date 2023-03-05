public abstract class BasisRezeptEssen extends BasisRezept {

    public boolean vegetarisch;
    public boolean vegan;

    public BasisRezeptEssen(String name, Zutat[]zutaten, boolean vegetarisch, boolean vegan, String typ){

        super(name, zutaten,typ);
        this.vegetarisch = vegetarisch;
        this.vegan = vegan;

    }

}
