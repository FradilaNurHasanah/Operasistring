/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo11;
import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    public static void main(String[] args)
    {
        String identitas = "Fradila Nur Hasanah / XRPL2 / 15";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerkata(kalimat, convert);
       
        }
        private static String tampilInput(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan kalimat : ");
            String kalimat = scanner.nextLine();
            System.out.println("kalimat asli : " + kalimat);
            return kalimat;
        }
        private static String vocal2Angka(String kalimat) {
            char [][] arConvert =
            {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
            
            kalimat = kalimat.toLowerCase();
            for(int i=0;i<arConvert.length;i++)
                kalimat =kalimat.replace(arConvert[i][0],arConvert[i][1]);
            return kalimat;
    }
        private static void tampilPerkata(String kalimat, String convert){
            String[] arrKal = kalimat.split(" ");
            String[] arrCon = convert.split(" ");
            
            for(int i=0;i<arrKal.length;i++)
                System.out.println(arrKal[i]+" => "+arrCon[i]);
            
        }
}
