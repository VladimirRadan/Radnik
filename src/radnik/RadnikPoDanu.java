package radnik;

public class RadnikPoDanu extends Radnik{

    private double brojDana, cenaDana;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String racun, double brojDana, double cenaDana) {
        super(ime, prezime, jmbg, racun);
        this.brojDana = brojDana;
        this.cenaDana = cenaDana;
    }


    public double obracunajPlatu(){
        return brojDana * cenaDana;
    }


    @Override
    public void isplatiPlatu() {
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }
}
