package radnik;

public class RadnikPoSatu extends Radnik{

    private double cenaSata, brojSati;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String racun, double cenaSata, double brojSati) {
        super(ime, prezime, jmbg, racun);
        this.cenaSata = cenaSata;
        this.brojSati = brojSati;
    }

    public double obracunajPlatu(){
        return cenaSata * brojSati;
    }


    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
