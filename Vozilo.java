public class Vozilo {
    protected String registracijskiBroj;
    protected String marka;
    protected int godinaProizvodnje;

    public void ucitajPodatke(String registracijskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje mora biti pozitivna.");
        }
        this.registracijskiBroj = registracijskiBroj;
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void prikaziPodatke() {
        System.out.println("Registracijski broj: " + registracijskiBroj);
        System.out.println("Marka: " + marka);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }

    public String toFileString() {
        return "Vozilo," + registracijskiBroj + "," + marka + "," + godinaProizvodnje;
    }
}