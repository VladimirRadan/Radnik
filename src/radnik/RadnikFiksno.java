package radnik;

public class RadnikFiksno extends Radnik{


    public RadnikFiksno(String ime, String prezime, String jmbg, String racun, double plata) {
        super(ime, prezime, jmbg, racun);
        this.plata = plata;
    }

    public double obracunajPlatu(){
        return plata;
    }

    @Override
    public void isplatiPlatu(){
        plata = obracunajPlatu();
        super.isplatiPlatu();
    }


}
