package evidencija;

public class Motocikl extends Vozilo {
    private String tipMotora;

    // Konstruktor koji odmah postavlja podatke
    public Motocikl(String registracijskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(registracijskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    // Prazan konstruktor potreban za učitavanje iz datoteke
    public Motocikl() {
        super();
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora: " + tipMotora);
    }

    @Override
    public String toFileString() {
        return "Motocikl," + registracijskiBroj + "," + marka + "," + godinaProizvodnje + "," + tipMotora;
    }

    // Dodatne metode za pristup tipu motora
    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }
}
