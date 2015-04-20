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
public class Alamat {
    private String jalan;
    private String nomortujuan;
    private String kelurahan;
    private String kecamatan;
    private String kabupatenkota;
    private String provinsi;

    /**
     * @param jalan the jalan to set
     * @throws java.lang.Exception
     */
    public void setJalan(String jalan) throws Exception {
        for (char i : jalan.toCharArray()){
            if (!Character.isDigit(i)&&!Character.isLetter(i)){
                throw new Exception("Maaf, hanya diperbolehkan memasukkan angka dan huruf!");
                }
        
        }
        this.jalan = jalan;
    }
    
    /**
     * @return the jalan
     */
    public String getJalan() {
        return jalan;
    }

    /**
     * @param nomortujuan the nomortujuan to set
     * @throws java.lang.Exception
     */
    public void setNomorTujuan(String nomortujuan) throws Exception {
        for (char i : nomortujuan.toCharArray()){
            if (!Character.isDigit(i)&&!Character.isLetter(i)){
                throw new Exception("Maaf, hanya diperbolehkan memasukkan angka dan huruf!");
                }
        }
        this.nomortujuan = nomortujuan;
    }

    /**
     * @return the nomorRumah
     */
    public String getNomorTujuan() {
        return nomortujuan;
    }

    /**
     * @param kelurahan the kelurahan to set
     * @throws java.lang.Exception
     */
    public void setKelurahan(String kelurahan) throws Exception {
               
        for (char i : kelurahan.toCharArray()){
            if (!Character.isLetter(i)){
                throw new Exception("Maaf, hanya diperbolehkan huruf!");
                }
        }
        this.kelurahan = kelurahan;
    }

    /**
     * @return the kelurahan
     */
    public String getKelurahan() {
       return kelurahan;
    }
    
    /**
     * @param kecamatan the kecamatan to set
     * @throws java.lang.Exception
     */
    public void setKecamatan(String kecamatan) throws Exception {
        for (char i : kecamatan.toCharArray()){
            if (!Character.isLetter(i)){
                throw new Exception("Maaf, hanya diperbolehkan huruf!");
            }
        }
        this.kecamatan = kecamatan;
           
    }
    /**
     * @return the kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kabupatenkota the kabupatenkota to set
     * @throws java.lang.Exception
     */
    public void setKabupatenkota(String kabupatenkota) throws Exception {
        for (char i : kabupatenkota.toCharArray()){
            if (!Character.isLetter(i)){
                throw new Exception("Maaf, hanya diperbolehkan huruf!");
                }
        }
        this.kabupatenkota = kabupatenkota;
    }

    /**
     * @return the kabupatenkota
     */
    public String getKabupatenkota() {
        return kabupatenkota;
    }
    
    /**
     * @param provinsi the provinsi to set
     * @throws java.lang.Exception
     */
    public void setProvinsi(String provinsi)throws Exception {
        for (char i : provinsi.toCharArray()){
             if (!Character.isLetter(i)){
                 throw new Exception("Maaf, hanya diperbolehkan huruf!");
                 }
        }
        this.provinsi = provinsi;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }
    
}
