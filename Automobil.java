public class Automobil extends Vozilo {
    private int brojVrata;

    public void ucitajPodatke(String registracijskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super.ucitajPodatke(registracijskiBroj, marka, godinaProizvodnje);
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan.");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata);
    }

    @Override
    public String toFileString() {
        return "Automobil," + registracijskiBroj + "," + marka + "," + godinaProizvodnje + "," + brojVrata;
    }
}