package src.MaikSchleckEierVonSchlonsX;

public class Fahrrad extends Fahrzeug{
    private double rahmenhoehe;


    public Fahrrad(String a, double b, double c, double d) {
        super(a, b, c);
        this.rahmenhoehe = d;
    }

    public void setRahmenhoehe(double rahmenhoehe) {
        this.rahmenhoehe = rahmenhoehe;
    }

    @Override
    public void druckeFahrzeugdaten() {
        super.druckeFahrzeugdaten();
        System.out.println("Rahmenhöhe: "+rahmenhoehe);
    }
}
