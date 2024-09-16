package src.MaikSchleckEierVonSchlonsX;

public class LKW extends Kraftfahrzeug{
    private double nutzlaste;

    public LKW(String a, double b, double c, double d, double e, double f){
        super(a,b,c,d,e);
        this.nutzlaste = f;
    }

    @Override
    public void druckeFahrzeugdaten() {
        super.druckeFahrzeugdaten();
        System.out.println("Nutzlast: "+nutzlaste);
    }
}
