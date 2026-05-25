import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<Nogometas> nogometasi = new ArrayList<Nogometas>();
//
//        Nogometas nogometas1 = new Nogometas("Ante", 2, 3);
//        Nogometas nogometas2 = new Nogometas("Mate", 5, 0);
//        Nogometas nogometas3 = new Nogometas("Stipe", 7, 5);
//        Nogometas nogometas4 = new Nogometas("Luka", 10, 1);
//
//        nogometasi.add(nogometas1);
//        nogometasi.add(nogometas2);
//        nogometasi.add(nogometas3);
//        nogometasi.add(nogometas4);
//
//        for (Nogometas nogometas : nogometasi) {
//            System.out.println(nogometas);
//        }
//        System.out.println("\n");
//
//        Collections.sort(nogometasi);
//
//        for (Nogometas nogometas : nogometasi) {
//            System.out.println(nogometas);
//        }


//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Integer> razlomak1 = new ArrayList<>();
//        ArrayList<Integer> razlomak2 = new ArrayList<>();
//
//        System.out.println("Unesite prvi razlomak");
//
//        String unos1 = sc.nextLine();
//        String[] dijelovi1 = unos1.split(" ");
//
//        for (String s : dijelovi1) {
//            razlomak1.add(Integer.parseInt(s));
//        }
//
//        System.out.println("Unesite drugi razlomak");
//
//        String unos2 = sc.nextLine();
//        String[] dijelovi2 = unos2.split(" ");
//
//        for (String s : dijelovi2) {
//            razlomak2.add(Integer.parseInt(s));
//        }
//
//        Razlomak razlomak = new Razlomak(razlomak1.get(0), razlomak1.get(1), razlomak2.get(0), razlomak2.get(1));
//
//        ArrayList<Integer> zbroj = razlomak.zbroj();
//        ArrayList<Integer> razlika = razlomak.razlika();
//        ArrayList<Integer> umnozak = razlomak.umnozak();
//        ArrayList<Integer> kvocijent = razlomak.kvocijent();
//
//        System.out.println("Zbroj: " + zbroj.get(0) + "/" + zbroj.get(1));
//        System.out.println("Razlika: " + razlika.get(0) + "/" + razlika.get(1));
//        System.out.println("Umnozak: " + umnozak.get(0) + "/" + umnozak.get(1));
//        System.out.println("kvocijent: " + kvocijent.get(0) + "/" + kvocijent.get(1));



        Scanner sc = new Scanner(System.in);

        Planinar[] planinari = new Planinar[3];


        for(int i = 0; i<3; i++){
            System.out.println("Unesite ime, prezime, broj osvojenih vrhova i visinu najviseg vrha planinara " + (i+1));
            String unos = sc.nextLine();
            String[] dijelovi = unos.split(" ");
            Planinar p = new Planinar(dijelovi[0], dijelovi[1]);
            p.setBrojOsvojenihVrhova(Integer.parseInt(dijelovi[2]));
            p.setVisinaNajvisegVrha(Double.parseDouble(dijelovi[3]));
            planinari[i] =p;
        }

        for (Planinar planinar : planinari) {
            System.out.println(planinar.dohvatiPodatke());

        }
    }








}