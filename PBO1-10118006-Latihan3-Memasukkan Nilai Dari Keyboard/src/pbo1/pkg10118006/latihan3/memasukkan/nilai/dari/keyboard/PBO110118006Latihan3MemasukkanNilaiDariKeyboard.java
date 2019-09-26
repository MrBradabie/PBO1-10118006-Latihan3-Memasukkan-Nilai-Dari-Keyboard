/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118006.latihan3.memasukkan.nilai.dari.keyboard;
import  java.util.Scanner;
/**
 *
 * @author 
 * NAMA  : Alfarizi Rizki Pane
 * KELAS : PBO1
 * NIM   : 10118006
 * Deskripsi Program : Program ini berisi  program untuk Memasukkan nilai dari keyboard
 */
public class PBO110118006Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
