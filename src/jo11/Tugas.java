/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo11;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args)
    {
        String input;
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukkan kata : ");
        input = baca.nextLine();
        
        System.out.println("Hasil Uppercase : " + input.toUpperCase());
        System.out.println("Hasil Lowercase : " + input.toLowerCase());
        System.out.println("Panjang karakter : " + input.length());
        
        System.out.println("NAMA        : Fradila Nur Hasanah");
        System.out.println("KELAS       : X RPL 2");
        System.out.println("NO.ABSEN    : 15");
                
    }
}
