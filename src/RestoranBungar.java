import java.util.Scanner;

public class RestoranBungar {
    private static Object Jumlah_orang;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah_orang;
        String nama;
        double makanan1_price = 9999.99,
               makanan2_price = 12345.67,
               makanan3_price = 21108.40,
               makanan4_price = 13479.13,
               makanan5_price = 98765.43;

        System.out.println("Selamat Datang Di Restoran BUNGAR");
        // ======================Add Jumlah======================= //
        System.out.print("Pesanan untuk berapa orang : ");
        Jumlah_orang = input.next();

        // =======================Add nama pesanan====================== //
        System.out.print("Pesanan atas nama : ");
        nama = input.next();

        // ==========================Daftar Menu============================== //
        System.out.println("\n Menu Special hari ini");
        System.out.println("========================");
        System.out.println("    1. Nasi Goreng Spesial      Rp. " + makanan1_price);
        System.out.println("    2. Ayam Bakar Spesial       Rp. " + makanan2_price);
        System.out.println("    3. Steak Sirloin Spesial    Rp. " + makanan3_price);
        System.out.println("    4. kwetiaw Siram Spesial    Rp. " + makanan4_price);
        System.out.println("    5. Kambing Guling Spesial   Rp. " + makanan5_price);
        System.out.println();

        // ===========================Add Pesanan============================== //
        System.out.println("Pesanan Anda [Batas Pesanan 0-10 Porsi]");
        System.out.print("Nasi Goreng Spesial     = ");
        int A = input.nextInt();
        System.out.print("Ayam Goreng spesial     = ");
        int B = input.nextInt();
        System.out.print("Steak Sirlon Spesial    = ");
        int C = input.nextInt();
        System.out.print("Kwetiaw Siram Spesial   = ");
        int D = input.nextInt();
        System.out.print("kambing Guling Spesial  = ");
        int E = input.nextInt();
        System.out.println();

        // ===========================Menghitung Pesanan============================== //
        System.out.println();
        System.out.println("Selamat menikmati makanan Anda");
        System.out.println();
        System.out.println("Pembelian : ");

        double HargaPembelianA = A * makanan1_price;
        double HargaPembelianB = B * makanan2_price;
        double HargaPembelianC = C * makanan3_price;
        double HargaPembelianD = D * makanan4_price;
        double HargaPembelianE = E * makanan5_price;
        double TotalPembelian = HargaPembelianA + HargaPembelianB + HargaPembelianC + HargaPembelianD + HargaPembelianE;
        double HargaDiskon = TotalPembelian * 0.1;
        double TotalSTD = TotalPembelian - HargaDiskon;

        System.out.printf("1. Nasi Goreng Spesial                   = %d porsi * Rp %f = Rp %f \n", A,makanan1_price,HargaPembelianA);
        System.out.printf("2. Ayam Goreng spesial                   = %d porsi * Rp %f = Rp %f \n", B,makanan2_price,HargaPembelianB);
        System.out.printf("3. Steak Sirlon Spesial                  = %d porsi * Rp %f = Rp %f \n", C,makanan3_price,HargaPembelianC);
        System.out.printf("4. Kwetiaw Siram Spesial                 = %d porsi * Rp %f = Rp %f \n", D,makanan4_price,HargaPembelianD);
        System.out.printf("5. kambing Guling Spesial                = %d porsi * Rp %f = Rp %f + \n", E,makanan5_price,HargaPembelianE);
        System.out.println("=========================================================================================================");
        System.out.println("Total Pembelian                         = Rp " + TotalPembelian);
        System.out.println("Disc. 10% <Masa Promosi>                = Rp " + HargaDiskon + "-");
        System.out.println("=========================================================================================================");
        System.out.println("Total Pembelian Setelah Disc 10%        = Rp " + TotalSTD);
        System.out.println("Pembelian Per Orang <untuk" + Jumlah_orang + "orang>    = ");


    }
}
