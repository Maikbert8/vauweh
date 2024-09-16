package src.MaikSchleckEierVonSchlonsX;

public class Fahrzeug{
    private String fahrzeugnummer;
    private double leergewicht;
    private double gesamtgewicht;

    public Fahrzeug(String a, double b, double c){
        this.fahrzeugnummer = a;
        this.leergewicht = b;
        this.gesamtgewicht = c;
    }

    public void druckeFahrzeugdaten(){
        System.out.println("Fahrzeugnummer: " + fahrzeugnummer);
        System.out.println("Leergewicht: " + leergewicht);
        System.out.println("Gesamtgewicht: " + gesamtgewicht);
    }
}