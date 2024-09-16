package src.MaikSchleckEierVonSchlonsX;

public class Kraftfahrzeug extends Fahrzeug{

    private double hoehstgeschwindigkeit;
    private double leistung;

    public Kraftfahrzeug(String a, double b, double c, double d, double e){
        super(a,b,c);
        this.hoehstgeschwindigkeit = d;
        this.leistung = e;
    }

    @Override
    public void druckeFahrzeugdaten() {
        super.druckeFahrzeugdaten();
        System.out.println("Hoehstgeschwindigkeit: "+hoehstgeschwindigkeit);
        System.out.println("Leistung: "+leistung);
    }
}
