/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum5;
import java.util.Scanner;

/**
 *
 * @author User
 */
    /**
     * @param args the command line arguments
     */
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("--- Input ---");
        System.out.print("NPM Mahasiswa    : ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa   : ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran  : ");
        double kehadiran = input.nextDouble();
        System.out.print("Nilai Tugas      : ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS        : ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS        : ");
        double uas = input.nextDouble();

        double nilaiAkhir = (0.10 * kehadiran) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        String grade, keterangan;
        if (nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "Kurang Sekali";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "Cukup";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "Baik";
        } else {
            grade = "A";
            keterangan = "Istimewa";
        }

        System.out.println("\n--- OUTPUT ---");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.printf("Nilai Rata-rata : %.2f\n", nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}

