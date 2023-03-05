public class Limonade extends BasisRezeptGetraenk {

    public String fruchtgeschmack;
    public Boolean herstellungInHouse;

    public Limonade (String name, Zutat[]zutaten, boolean heißGetraenk, boolean zuckerfrei, String fruchtgeschmack, boolean herstellungInHouse){

        super(name, zutaten, heißGetraenk, zuckerfrei, "Limonade");
        this.fruchtgeschmack = fruchtgeschmack;
        this.herstellungInHouse = herstellungInHouse;

    }

    public boolean eiswuerfelMitKundeAbstimmen() {

        return true;

    }
}
