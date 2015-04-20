/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percetakan;

/**
 *
 * @author Asus
 */
public class Biaya {
    private String jeniscetak;
    private double biayajeniscetak;
    private String ukurancetak;
    private double biayaukurancetak;
    private double biayajumlahcetak;
    Pemesan pemesan;
    private HasilCetak jenishasilcetak;
    private HasilCetak ukuranhasilcetak;
    private HasilCetak jumlahhasilcetak;

    
             
    /**
     * @param jenishasilcetak
     */
    public void setBiayaJenisCetak(HasilCetak jenishasilcetak) {
        switch(ukurancetak){
            case "A2": biayajeniscetak = 300;
                    break;
            case "A3": biayajeniscetak = 200;
                    break;
            case "A4": biayajeniscetak = 100;
                    break;
            case "A5": biayajeniscetak = 50;
                    break;
            case "B5": biayajeniscetak = 80;
                    break;
            default: biayajeniscetak = 100;
                    break; 
        }
        this.jenishasilcetak = jenishasilcetak;
    }
    
    /**
     * @return the hasilcetak
     */
    public double getBiayaJenisCetak() {
        return biayajeniscetak;
    }
    
    /**
     * @param ukuranhasilcetak
     */
    public void setBiayaUkuranCetak(HasilCetak ukuranhasilcetak) {
        switch(jeniscetak){
            case "HVS"              : biayaukurancetak = 1;
                    break;
            case "Art/Matt Paper"   : biayaukurancetak = 2;
                    break;
            case "Art Karton"       : biayaukurancetak = 3;
                    break;
            case "Glossy Foto Paper": biayaukurancetak = 4;
                    break;
            default                 : biayaukurancetak = 2;
                    break; 
        }
        
    }
    
    /**
     * @return the ukuranasilcetak
     */
    public double getBiayaUkuranCetak() {
        return biayaukurancetak;
    }
    
    private double biayajumlahcetak(HasilCetak jumlahhasilcetak){
       double a = jumlahhasilcetak.getJumlahCetak();
           
       return biayajumlahcetak ;
    }
    
    /**
     * @return the jumlahhasilcetak
     */
    public double getBiayaJumlahCetak() {
        return biayajumlahcetak;
    }
    
    public double Biaya (){
       double a = getBiayaJenisCetak();
       double b = getBiayaUkuranCetak();
       double c = getBiayaJumlahCetak();
           
       double Biaya = a*b*c;
       
       return Biaya;
   }

   
}
