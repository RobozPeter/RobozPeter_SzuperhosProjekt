package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        if (vanEGyengesege) {
            return String.format("Szupererő: %.2f; van gyengesége", Math.round(szuperero*100)/100.0);
        }
        return String.format("Szupererő: %.2f; nincs gyengesége", Math.round(szuperero*100)/100.0);
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo bosszuallo = (Bosszuallo) szuperhos;

            if (bosszuallo.isVanEGyengesege()) {
                return this.szuperero > bosszuallo.getSzuperero();
            }
        }

        if (szuperhos instanceof Batman) {
            Batman batman = (Batman) szuperhos;
            return this.szuperero >= batman.mekkoraAzEreje()*2;

        } return false;
    }
    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }
}
