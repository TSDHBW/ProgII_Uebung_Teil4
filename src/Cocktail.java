public class Cocktail extends BasisRezeptGetraenk {

    public int alkohlgehalt;
    public boolean alkohlfrei;

    public Cocktail(String name, Zutat[]zutaten, boolean heißGetraenk, boolean zuckerfrei, int alkohlgehalt, boolean alkohlfrei){

        super(name, zutaten, heißGetraenk, zuckerfrei, "Cocktail");
        this.alkohlgehalt = alkohlgehalt;
        this.alkohlfrei = alkohlfrei;

    }

    public String glasMitKundeAbstimmen() {

        return "";

    }

}
