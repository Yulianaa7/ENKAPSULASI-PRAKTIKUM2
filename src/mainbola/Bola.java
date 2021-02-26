package mainbola;

/**
 *
 * @author Yuliana
 */
public class Bola {
    //mendeklarasikan variabel
    private double jarijari;
    
    //parameter class Bola
    public Bola(double Jarijari){
        this.jarijari = Jarijari;
    }
    //membuat parameter method void setJarijari
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    //method void showDiameter
    public void showDiameter(){
        System.out.println("Diameter Bola : "+2*jarijari);//rumus diameter
    }
    //method void showLuasPermukaan
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola adalah : "+(4*Math.PI*jarijari*jarijari));//rumus luasPermukaan
    }
    //method void showVolume
    public void showVolume(){
        System.out.println("Volume Bola adalah : "+(4*Math.PI*jarijari*jarijari/3));//rumus volume bola
    }
    
}