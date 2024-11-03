package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        Kepregeny k = new Kepregeny();
        try {
            k.szereplok("szuperhosok.txt");
        } catch (Exception e) {
            System.out.println("Hiba a szereplők beolvasásakor: " + e.getMessage());
        }
        try {
            k.szuperhosok();
        } catch (Exception e) {
            System.out.println("Hiba a szuperhősök kiírásakor: " + e.getMessage());
        }
    }
}