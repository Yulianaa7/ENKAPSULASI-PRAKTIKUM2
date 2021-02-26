package mainbola;

/**
 *
 * @author Yuliana
 */
public class MainBola {

    public static void main(String[] args) {
        //membuat objek dan memasukkan parameter
        Bola bola = new Bola(7);
        
        //memanggil method shiwDiameter yang ada di kelas Bola
        bola.showDiameter();
        //memanggil method showLuasPermukaan yang ada di kelas Bola
        bola.showLuasPermukaan();
        //memanggil method showVolume yang ada di kelas Bola
        bola.showVolume();
        
        System.out.println("");
        double Jarijari = 14; //membuat variabel baru untuk memanipulasi
        bola.setJarijari(Jarijari);//manipulasi objek dengan variabel baru
        bola.showDiameter();//memanggil method shiwDiameter yang ada di kelas Bola
        bola.showLuasPermukaan();//memanggil method showLuasPermukaan yang ada di kelas Bola
        bola.showVolume();//memanggil method showVolume yang ada di kelas Bola
    }
    
}