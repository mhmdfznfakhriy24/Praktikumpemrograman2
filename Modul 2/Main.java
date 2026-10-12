package module02.problem03;

public class Main {
    public static void main(String[] args) {
        //Pada baris ini terjadi error karena class Pegawai tidak ada (class yang tersedia bernama Employee)
        //Pegawai p1 = new Pegawai();
        Employee p1 = new Employee();
        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada baris ini umur belum diisi sehingga bernilai default 0, padahal output meminta 17
        p1.umur = 17;

        //Teks tidak sesuai output yang diminta ("Nama:" bukan "Nama Pegawai:")
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Output meminta tambahan kata "tahun" setelah umur
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}