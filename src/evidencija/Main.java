package evidencija;

public class Main {
    public static void main(String[] args) {
        EvidencijaVozila evidencija = new EvidencijaVozila();
        try {
            Automobil auto1 = new Automobil("ZG1234AB", "BMW", 2018, 5);
            Motocikl moto1 = new Motocikl("ST5678CD", "Yamaha", 2020, "Sport");

            evidencija.dodajVozilo(auto1);
            evidencija.dodajVozilo(moto1);

            evidencija.spremiPodatkeUDatoteku("vozila.txt");

            EvidencijaVozila novaEvidencija = new EvidencijaVozila();
            novaEvidencija.ucitajPodatkeIzDatoteke("vozila.txt");
            novaEvidencija.prikaziVozila();
        } catch (NeispravniPodaciException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }
}
