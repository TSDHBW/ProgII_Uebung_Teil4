public class FleischGericht extends BasisRezeptEssen {

    public String fleischsorte;
    public int zielKerntemperatur;
    public int zubereitungstemperatur;

    public FleischGericht(String name, Zutat[]zutaten, boolean vegetarisch, boolean vegan, String fleischsorte, int zielKerntemperatur, int zubereitungstemperatur){

        super(name, zutaten, vegetarisch, vegan);
        this.fleischsorte = fleischsorte;
        this.zielKerntemperatur = zielKerntemperatur;
        this.zubereitungstemperatur = zubereitungstemperatur;

    }

    public String gargradMitKundeAbstimmen() {

        return "";

    }

}
