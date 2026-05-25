import java.util.ArrayList;

public class Razlomak {

    private int brojnik1;
    private int nazivnik1;
    private int brojnik2;
    private int nazivnik2;

    public Razlomak(int brojnik1, int nazivnik1, int brojnik2, int nazivnik2) {
        this.brojnik1 = brojnik1;
        this.nazivnik1 = nazivnik1;
        this.brojnik2 = brojnik2;
        this.nazivnik2 = nazivnik2;
    }

    public ArrayList<Integer> zbroj() {
        ArrayList<Integer> rezultat = new ArrayList<>();
        if (nazivnik1 != nazivnik2) {
            int nzv = nzv(nazivnik1, nazivnik2);

            brojnik1 = (nzv / nazivnik1) * brojnik1;
            brojnik2 = (nzv / nazivnik2) * brojnik2;

            nazivnik1 = nazivnik2 = nzv;

        }
        int brojnik = brojnik1 + brojnik2;
        int nazivnik = nazivnik1;

        int nzd = nzd(brojnik, nazivnik);
        rezultat.add(brojnik / nzd);
        rezultat.add(nazivnik / nzd);

        return rezultat;
    }

    public ArrayList<Integer> razlika() {
        ArrayList<Integer> rezultat = new ArrayList<>();

        if (nazivnik1 != nazivnik2) {
            int nzv = nzv(nazivnik1, nazivnik2);
            nazivnik1 = nazivnik2 = nzv;

            brojnik1 = (nzv / nazivnik1) * brojnik1;
            brojnik2 = (nzv / nazivnik2) * brojnik2;
        }

        int brojnik = brojnik1 - brojnik2;
        int nazivnik = nazivnik1;

        int nzd = nzd(brojnik, nazivnik);
        if (nzd > 1) {
            brojnik /= nzd;
            nazivnik /= nzd;
        }
        rezultat.add(brojnik);
        rezultat.add(nazivnik);


        return rezultat;
    }

    public ArrayList<Integer> umnozak() {
        ArrayList<Integer> rezultat = new ArrayList<>();

        int brojnik = brojnik1 * brojnik2;
        int nazivnik = nazivnik1 * nazivnik2;

        int nzd = nzd(brojnik, nazivnik);

        rezultat.add(brojnik / nzd);
        rezultat.add(nazivnik / nzd);

        return rezultat;
    }

    public ArrayList<Integer> kvocijent() {
        ArrayList<Integer> rezultat = new ArrayList<>();

        int brojnik = brojnik1 * nazivnik2;
        int nazivnik = nazivnik1 * brojnik2;

        int nzd = nzd(brojnik, nazivnik);

        rezultat.add(brojnik / nzd);
        rezultat.add(nazivnik / nzd);

        return rezultat;
    }

    private int nzd(int n1, int n2) {
        while (n2 != 0) {
            int ostatak = n1 % n2;
            n1 = n2;
            n2 = ostatak;
        }
        return n1;
    }

    private int nzv(int n1, int n2) {
        return n1 * n2 / nzd(n1, n2);
    }
}
