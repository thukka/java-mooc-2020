
public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia

        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
        mehu.otaVarastosta(11.3);
        mehu.lisaaVarastoon(1.0);
//System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]

        mehu.tulostaAnalyysi();
        System.out.println("");
        MuistavaTuotevarasto mtv = new MuistavaTuotevarasto("kahvi", 10,5);
        System.out.println(mtv.getSaldo());
        System.out.println("test " + mtv.otaVarastosta(7));
        System.out.println("");
        Tuotevarasto test = new Tuotevarasto("moi", 1000);
        test.lisaaVarastoon(1000);
        System.out.println(test.otaVarastosta(50.5));
    }

}
