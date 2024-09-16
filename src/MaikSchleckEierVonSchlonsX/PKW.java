package src.MaikSchleckEierVonSchlonsX;

public class PKW extends Kraftfahrzeug{

    private int anzahlSitzplaetze;

    public PKW ( String a, double b, double c, double d, double e, int f){
        super (a,b,c,d,e);
        this.anzahlSitzplaetze = f;
    }

    @Override
    public void druckeFahrzeugdaten(){
        super.druckeFahrzeugdaten();
        System.out.println("Anzahl der Sitzplaetze: "+ anzahlSitzplaetze);

    }
}
