package module02.problem03;

//Catatan: pada soal, class bernama Employee tetapi file bernama Pegawai.java sehingga terjadi error
//karena nama class public harus sama dengan nama file. Di sini file diberi nama Employee.java agar sesuai.
public class Employee {
    public String nama;
    //Pada baris ini terjadi error karena tipe char hanya menampung 1 karakter, sedangkan asal berisi teks dan getAsal() bertipe String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Pada baris ini terjadi error karena method tidak punya parameter, padahal dipanggil dengan argumen dan memakai variabel j yang belum dideklarasikan
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
