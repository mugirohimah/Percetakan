/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percetakan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Percetakan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   
        Scanner keyboard = new Scanner(System.in);
       
       
        Pemesan pemesan1 = new Pemesan();
    
        {System.out.println("Masukan Nama Pemesan : ");
              
        boolean error = true;
        while(error) {
        try {
            pemesan1.setNama(keyboard.nextLine());
            error = false;
        } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
        }
        
        Alamat alamatPemesan1 = new Alamat();
        {isiAlamat(alamatPemesan1);
        pemesan1.setAlamat(alamatPemesan1);
        }
        
        HasilCetak hasilcetak1 = new HasilCetak();
        {isiHasilCetak(hasilcetak1);
        pemesan1.setHasilCetak(hasilcetak1);
        }
        
        Pegawai pegawai1 = new Pegawai();
        {System.out.println("Masukan Nama Pegawai : ");
        
        boolean error = true;
        while(error) {
        try {
            pegawai1.setNama(keyboard.nextLine());
            error = false;
        } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
        }
        
        
        Biaya biaya1 = new Biaya();
        System.out.println("Biaya : ");
        System.out.println(biaya1.Biaya());
        
    }

    static void isiAlamat(Alamat alamat) {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("masukan jalan:");       
        { boolean error = true;
        while(error) {
        try {
        alamat.setJalan(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nomor tujuan:");
      {boolean error = true;
       while(error) {
       try {
         alamat.setNomorTujuan(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
      
       System.out.println("masukan nama Kelurahan:");
        
       {boolean error = true;
        while(error){
           try {
                alamat.setKelurahan(keyboard.nextLine());
                error = false;
           } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            } 
        }
       
            
        }
         
       System.out.println("masukan nama Kecamatan:");
       {boolean error = true;
       while(error) {
       try {
         alamat.setKecamatan(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
       System.out.println("masukan nama Kabupaten/Kota:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setKabupatenkota(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
       }
        
        System.out.println("masukan nama Provinsi:");
        {boolean error = true;
       while(error) {
       try {
         alamat.setProvinsi(keyboard.nextLine());
         error = false;
       } catch (Exception e) {
            System.out.println("Terjadi error : " +e.getMessage());
            }
        }
        }
        }
    static void cetakAlamat(Alamat alamat){
        System.out.println("Jalan           : " + alamat.getJalan());
        System.out.println("Nomor Tujuan    : " + alamat.getNomorTujuan());
        System.out.println("Kelurahan       : " + alamat.getKelurahan());
        System.out.println("Kecamatan       : " + alamat.getKecamatan());
        System.out.println("Kabupaten/Kota  : " + alamat.getKabupatenkota());
        System.out.println("Provinsi        : " + alamat.getProvinsi());    
      
    }
      
    static void isiHasilCetak(HasilCetak hasilcetak){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Jenis kertas : ");
        System.out.println("1. HVS\n2. Art/Matt Paper\n3. Art Karton\n4. Glossy Foto Paper\n5. Lainnya(default)");
        while (!keyboard.hasNextInt()) {
            System.out.println("Pilih angka dari Pilihan diatas!");
            keyboard.nextInt();
        } hasilcetak.setJenisCetak(keyboard.nextInt());
        
        System.out.println("Jenis Ukuran Kertas : ");
        System.out.println("1. A2\n2. A3\n3. A4\n4. A5\n5. B5");
        while (!keyboard.hasNextInt()) {
            System.out.println("Pilih angka dari Pilihan diatas!");
            keyboard.nextInt();
        } hasilcetak.setUkuranCetak(keyboard.nextInt());
        
        System.out.println("Jumlah : ");
        hasilcetak.setJumlahCetak(keyboard.nextInt());
    }

            

}
