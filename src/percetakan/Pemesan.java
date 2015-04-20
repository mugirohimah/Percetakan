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
public class Pemesan {
    private String namapemesan;
    private Alamat alamat;
    private HasilCetak hasilcetak;

    /**
     * @param namapemesan the namapemesan to set
     * @throws java.lang.Exception
     */
    public void setNama(String namapemesan) throws Exception {
        for (char i : namapemesan.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Maaf, hanya diperbolehkan huruf!");
                }
        }
        this.namapemesan = namapemesan;
    }

    /**
     * @return the namapemesan
     */
    public String getNama() {
        return namapemesan;
    }
    
    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the alamat
     */
    public Alamat getAlamat() {
        return alamat;
    }
    
    /**
     * @param hasilcetak the hasilcetak to set
     */
    public void setHasilCetak (HasilCetak hasilcetak) {
        this.hasilcetak = hasilcetak;
    }
    
    /**
     * @return the hasilcetak
     */
    public HasilCetak getHasilCetak() {
        return hasilcetak;
    }    
}  

