package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    private boolean vanPancel;

    public Vasember() {
        super(150, true);
        this.vanPancel = true;
    }

    @Override
    public boolean megmentiAVilagot() {
     if(this.getSzuperero() > 1000){
            return true;
        };
        return false;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo bosszuallo = (Bosszuallo) szuperhos;
            if (bosszuallo.isVanEGyengesege()) {
                return this.getSzuperero() > bosszuallo.getSzuperero();
            }
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return super.mekkoraAzEreje();
    }

    public boolean isVanPancel() {
        return vanPancel;
    }

    public void setVanPancel(boolean vanPancel) {
        this.vanPancel = vanPancel;
    }


    @Override
    public void kutyutKeszit() {
        Random r = new Random();
        this.setSzuperero(this.getSzuperero() + r.nextDouble(0,10));
    }
    @Override
    public String toString() {
        if (this.isVanEGyengesege()) {
            return String.format("Vasember: Szupererő: %d; van gyengesége", Math.round(this.getSzuperero()));
        }
        return String.format("Vasember: Szupererő: %d; nincs gyengesége", Math.round(this.getSzuperero()));
    }
}
