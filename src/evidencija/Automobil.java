package evidencija;

public class Automobil extends Vozilo {
    private int brojVrata;

    // Konstruktor koji odmah postavlja podatke
    public Automobil(String registracijskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(registracijskiBroj, marka, godinaProizvodnje);
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan.");
        }
        this.brojVrata = brojVrata;
    }

    // Prazan konstruktor potreban za učitavanje iz datoteke
    public Automobil() {
        super();
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

    // Dodatne metode za postavljanje i dohvaćanje broja vrata
    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata mora biti pozitivan.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }
}
