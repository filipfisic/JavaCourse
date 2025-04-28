public class Motocikl extends Vozilo {
    private String tipMotora;

    public void ucitajPodatke(String registracijskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super.ucitajPodatke(registracijskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
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
}