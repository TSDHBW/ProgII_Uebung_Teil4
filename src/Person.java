public class Person {

    private String vorname;
    private String name;
    private String adresse;
    private String geburtsdatum;
    private double gehalt;

    public Person(String vorname, String name, String adresse, String geburtsdatum, double gehalt){

        this.vorname = vorname;
        this.name = name;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        this.gehalt = gehalt;

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

}
