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
public class Pegawai {
    private String namapegawai;
    private String id;
     
  
    /**
     * @param namapegawai the namapegawai to set
     * @throws java.lang.Exception
     */
    public void setNama(String namapegawai) throws Exception {
        for (char i : namapegawai.toCharArray()){
                if (!Character.isLetter(i)){
                    throw new Exception("Maaf, hanya diperbolehkan huruf!");
                }
        }
        this.namapegawai = namapegawai;
    }

    /**
     * @return the namapegawai
     */
    public String getNama() {
        return namapegawai;
    }
    
    /**
     * @param id the id to set
     */
    public void setId (String id) {
        this.id = id;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
    /**
     * @param alamat the alamat to set
     */
   
}  
