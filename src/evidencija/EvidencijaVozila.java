package evidencija;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila {
    private List<Vozilo> vozila = new ArrayList<>();

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku(String datoteka) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(datoteka))) {
            for (Vozilo v : vozila) {
                writer.write(v.toFileString());
                writer.newLine();
            }
            System.out.println("Podaci su uspješno spremljeni u " + datoteka);
        } catch (IOException e) {
            System.out.println("Greška pri spremanju podataka: " + e.getMessage());
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) {
        vozila.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(datoteka))) {
            String linija;
            int brojLinije = 0;
            while ((linija = reader.readLine()) != null) {
                brojLinije++;
                try {
                    String[] dijelovi = linija.split(",");
                    switch (dijelovi[0]) {
                        case "Automobil":
                            Automobil auto = new Automobil();
                            auto.ucitajPodatke(dijelovi[1], dijelovi[2], Integer.parseInt(dijelovi[3]), Integer.parseInt(dijelovi[4]));
                            vozila.add(auto);
                            break;
                        case "Motocikl":
                            Motocikl moto = new Motocikl();
                            moto.ucitajPodatke(dijelovi[1], dijelovi[2], Integer.parseInt(dijelovi[3]), dijelovi[4]);
                            vozila.add(moto);
                            break;
                        case "Vozilo":
                            Vozilo vozilo = new Vozilo();
                            vozilo.ucitajPodatke(dijelovi[1], dijelovi[2], Integer.parseInt(dijelovi[3]));
                            vozila.add(vozilo);
                            break;
                        default:
                            System.out.println("Nepoznat tip vozila na liniji " + brojLinije + ": " + dijelovi[0]);
                    }
                } catch (Exception e) {
                    System.out.println("Greška pri obradi linije " + brojLinije + ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Greška pri čitanju datoteke: " + e.getMessage());
        }
    }

    public void prikaziVozila() {
        if (vozila.isEmpty()) {
            System.out.println("Nema učitanih vozila.");
        }
        for (Vozilo v : vozila) {
            v.prikaziPodatke();
            System.out.println("------------------");
        }
    }
}
