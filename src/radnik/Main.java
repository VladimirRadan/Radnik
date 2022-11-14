package radnik;

public class Main {

    public static void main(String[] args) {

        RadnikFiksno rf = new RadnikFiksno("Pera", "Peric", "3424324234", "32432-4324", 100000);
        RadnikPoDanu rd = new RadnikPoDanu("Pera", "Peric", "3424324234", "32432-4324", 24, 2500);
        RadnikPoSatu rs = new RadnikPoSatu("Pera", "Peric", "3424324234", "32432-4324", 100, 300);

        rf.isplatiPlatu();
        rd.isplatiPlatu();
        rs.isplatiPlatu();



    }



}
