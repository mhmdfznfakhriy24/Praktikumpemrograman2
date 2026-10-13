package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // mencari student berdasarkan NIM, null jika tidak ada
    static Student findByStudentId(ArrayList<Student> list, String studentId) {
        for (Student s : list) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Pilihan harus berupa angka.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentId = input.nextLine();

                    if (findByStudentId(studentList, studentId) != null) {
                        System.out.println("NIM " + studentId + " sudah terdaftar.");
                    } else {
                        studentList.add(new Student(name, studentId));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idToDelete = input.nextLine();
                    Student target = findByStudentId(studentList, idToDelete);

                    if (target != null) {
                        studentList.remove(target);
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + idToDelete + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String idToFind = input.nextLine();
                    Student result = findByStudentId(studentList, idToFind);

                    if (result != null) {
                        System.out.println("NIM: " + result.getStudentId() + ", Nama: " + result.getName());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + idToFind + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student s : studentList) {
                        System.out.println("NIM: " + s.getStudentId() + ", Nama: " + s.getName());
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}