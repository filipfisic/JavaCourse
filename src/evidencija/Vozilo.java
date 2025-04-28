package evidencija;

public class Vozilo {
    protected String registracijskiBroj;
    protected String marka;
    protected int godinaProizvodnje;

    // Konstruktor koji odmah postavlja sve podatke
    public Vozilo(String registracijskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivna.");
        }
        this.registracijskiBroj = registracijskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    // Prazan konstruktor potreban za učitavanje iz datoteke
    public Vozilo() {
    }

    public void prikaziPodatke() {
        System.out.println("Registracijski broj: " + registracijskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }

    public String toFileString() {
        return "Vozilo," + registracijskiBroj + "," + marka + "," + godinaProizvodnje;
    }

    // Dodatne metode za pristup podacima
    public String getRegistracijskiBroj() {
        return registracijskiBroj;
    }

    public String getMarka() {
        return marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }
}
