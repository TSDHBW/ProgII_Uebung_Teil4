public abstract class BasisRezeptGetraenk extends BasisRezept {

    public boolean heißGetraenk;
    public boolean zuckerfrei;

    public BasisRezeptGetraenk(String name, Zutat[]zutaten, boolean heißGetraenk, boolean zuckerfrei, String typ){

        super(name, zutaten, typ);
        this.heißGetraenk = heißGetraenk;
        this.zuckerfrei = zuckerfrei;

    }
}
