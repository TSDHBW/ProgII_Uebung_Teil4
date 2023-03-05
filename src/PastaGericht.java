public class PastaGericht extends BasisRezeptEssen {

    public String nudelsorte;
    public boolean vorspeise;

    public PastaGericht (String name, Zutat[]zutaten, boolean vegetarisch, boolean vegan, String nudelsorte, boolean vorspeise){

        super(name, zutaten, vegetarisch, vegan, "Pastagericht");
        this.nudelsorte = nudelsorte;
        this.vorspeise = vorspeise;

    }

    public boolean parmesanMitKundeAbstimmen(){

        return true;

    }

}
