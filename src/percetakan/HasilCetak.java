/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percetakan;

/**
 *
 * @author Mugi
 */
public class HasilCetak {
    private String jeniscetak;
    private int JenisCetak;
    private String ukurancetak;
    private int UkuranCetak;
    private int jumlahcetak;
       
    /**
     * @param JenisCetak
     */
    public void setJenisCetak(int JenisCetak) {
        switch(JenisCetak){
            case 1: jeniscetak = "HVS";
                    break;
            case 2: jeniscetak = "Art/Matt Paper";
                    break;
            case 3: jeniscetak = "Art Karton";
                    break;
            case 4: jeniscetak = "Glossy Foto Paper";
                    break;
            default: jeniscetak = "Lainnya";
                    break;       
        }
        this.JenisCetak = JenisCetak;
    }

    /**
     * @return the JenisCetak
     */
    public int getJenisCetak() {
        return JenisCetak;
    }
    
    /**
     * @param UkuranCetak
     */
    public void setUkuranCetak(int UkuranCetak) {
        switch(UkuranCetak){
            case 1: ukurancetak = "A2";
                    break;
            case 2: ukurancetak = "A3";
                    break;
            case 3: ukurancetak = "A4";
                    break;
            case 4: ukurancetak = "A5";
                    break;
            case 5: ukurancetak = "B5";
                    break;
            default: ukurancetak = "Lainnya";
                    break; 
        }
        this.UkuranCetak = UkuranCetak;
    }
    
    /**
     * @return the UkuranCetak
     */
    public int getUkuranCetak() {
        return UkuranCetak;
    }

    /**
     * @param jumlahcetak the jumlahcetak to set
     */
    public void setJumlahCetak(int jumlahcetak) {
          
         this.jumlahcetak = jumlahcetak;
    }
    
    /**
     * @return the jumlahcetak
     */
    public int getJumlahCetak() {
        return jumlahcetak;
    }
}
