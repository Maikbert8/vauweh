package src.MaikSchleckEierVonSchlonsX;

public class Fahrzeug{
    private String fahrzeugnummer;
    private double leergewicht;
    private double gesamtgewicht;

    public void druckeFahrzeugdaten(){
        System.out.println("Fahrzeug: "+fahrzeugnummer+"");
    }
}