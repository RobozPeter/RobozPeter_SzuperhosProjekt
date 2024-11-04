package hu.petrik.szuperhosprojekt;

public class Batman implements Milliardos, Szuperhos {
    private double lelemenyseg;

        public Batman() {
            this.lelemenyseg = 100;
        }

        @Override
        public boolean legyoziE(Szuperhos szuperhos) {
            if (szuperhos.mekkoraAzEreje() < this.lelemenyseg) {
                return true;
            }
            return false;
        }

        @Override
        public double mekkoraAzEreje() {
            return this.lelemenyseg*2;
        }

        @Override
        public void kutyutKeszit() {
            this.lelemenyseg += 50;
        }

        @Override
        public String toString() {
            return String.format("Batman: leleményesség: %d",  Math.round(this.lelemenyseg));
        }


}
