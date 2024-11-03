package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<>();
    public static void szereplok(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int times = Integer.parseInt(parts[1]);
                Szuperhos szuperhos = null;

                if (name.equals("Batman")) {
                    szuperhos = new Batman();
                } else if (name.equals("Vasember")) {
                    szuperhos = new Vasember(); // Example constructor, adjust as needed
                }

                if (szuperhos instanceof Milliardos) {
                    Milliardos milliardos = (Milliardos) szuperhos;
                    for (int i = 0; i < times; i++) {
                        milliardos.kutyutKeszit();
                    }
                }

                szuperhosLista.add(szuperhos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }


    public void szuperhosokTamadja() {
        for (int i = 0; i < szuperhosLista.size(); i++) {
            for (int j = 0; j < szuperhosLista.size(); j++) {
                if (i != j) {
                    if (szuperhosLista.get(i).legyoziE(szuperhosLista.get(j))) {
                        System.out.println(szuperhosLista.get(i) + " legyőzi " + szuperhosLista.get(j));
                    } else {
                        System.out.println(szuperhosLista.get(i) + " nem tudja legyőzni " + szuperhosLista.get(j));
                    }
                }
            }
        }
    }
}
