/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo11;

import java.util.Locale;

public class CobaOperasiString {
    public static void main(String[] args)
    {
        String identitas = "Fradila Nur Hasanah / X RPL 2 / 15";
        System.out.println("Identitas : "+ identitas);
    
    String x = "Operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
    System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : "+ z);
        System.out.println("isi x sama dengan z (Case Sensitive): "+ x.equals(z));
        
        String r = "Operasi";
        System.out.println("isi variable r : "+ r);
        System.out.println("isi x sama dengan r (Case Sensitive): "+ x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) ; "+ x.equalsIgnoreCase(r));
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan z (case Sensitive): "+ x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive) : "+ x.compareTo(r));
        System.out.println("perbandingan isi x dengan r (Not Case Sensitive) ; "+ x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("isi variable s : "+ s);
        System.out.println("perbandingan isi r dengan s (Case Sensitive) : "+ r.compareTo(s));
        
         System.out.println("pada x terdapat huruf 'a' : " + x.contains("a")); // terdapat di dalamnya
        
        System.out.println("isi variable x besar semua : "+ x.toUpperCase()); //huruf besar
        System.out.println("isi variable x kecil semua : "+ x.toLowerCase()); // huruf kecil
        
        String t = "  operasi string  ";
        System.out.println("isi variable t : \""+ t +"\"");
        System.out.println("isi variable t tanpa spasi : \""+ t.trim() +"\""); // menghapus
        
        System.out.println("gabungkan isi variable x dan r : "+ x.concat(r)); // menggabungkan kata
    }
}
        
        