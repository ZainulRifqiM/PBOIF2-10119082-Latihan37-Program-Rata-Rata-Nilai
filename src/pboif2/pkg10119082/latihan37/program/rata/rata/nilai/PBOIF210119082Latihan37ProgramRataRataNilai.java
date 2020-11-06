/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan37.program.rata.rata.nilai;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Program Rata-Rata Nilai
 */
public class PBOIF210119082Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        
        nilai.inputNilai();
        nilai.nilaiMahasiswa();
        System.out.println("Maka, Rata-rata Nilainya adalah : " + nilai.rataRataNilai());
    }
    
}
