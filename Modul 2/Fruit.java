package module02.problem01;

public class Fruit {
    private String name;
    private double weight;
    private double price;
    private double quantity;

    public Fruit(String name, double weight, double price, double quantity) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    public double hitungHargaSebelumDiskon() {
        return (quantity / weight) * price;
    }

    public double hitungTotalDiskon() {
        int kelipatan = (int) (quantity / 4);
        return kelipatan * 0.02 * 4 * price;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + quantity + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", hitungTotalDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}