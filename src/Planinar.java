public class Planinar {
    private String ime;
    private String prezime;
    private int brojOsvojenihVrhova;
    private double visinaNajvisegVrha;

    public Planinar(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String dohvatiPodatke() {
        return "Planinar " + ime + " " + prezime + " ima " + brojOsvojenihVrhova + " osvojenih vrhova, a visina najvećeg vrha je " + visinaNajvisegVrha;
    }

    public void setBrojOsvojenihVrhova(int brojOsvojenihVrhova) {
        this.brojOsvojenihVrhova = brojOsvojenihVrhova;
    }

    public void setVisinaNajvisegVrha(double visinaNajvisegVrha) {
        this.visinaNajvisegVrha = visinaNajvisegVrha;
    }
}
