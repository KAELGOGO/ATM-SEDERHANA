
import java.util.Scanner;

class akunBank {
    private int nomorAkun;
    private String namaPemilik;
    private Double saldo;

    public akunBank(int nomorAkun, String namaPemilik, double saldo) {
        this.nomorAkun = nomorAkun;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public int dapatnomorAkun() {
        return nomorAkun;
    }

    public String dapatnamaPemilik() {
        return namaPemilik;
    }

    public Double dapatSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("deposit berhasil " + saldo);
        } else {
            System.out.println("deposit gagal , tolong ganti jumlah");
        }
    }

    public void penarikan(double jumlah) {
        if (jumlah > 0 || saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("penarikan berhasil " + saldo);
        } else {
            System.out.println("penarikan gagal " + saldo);
        }
    }

    public void saldo() {
        System.out.println("berjumlah " + saldo);
    }
}

public class App {
    public static void main(String[] args) {
        akunBank akun = new akunBank(282280, "kael", 100000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM SEDERHANA");
            System.out.println("tekan 1 untuk deposit");
            System.out.println("tekan 2 untuk penarikan ");
            System.out.println("tekan 3 untuk melihat saldo");
            System.out.println("tekan 4 keluar");
            System.out.print("silahkan pilih : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("tolong masukkan jumlah : ");
                    Double inpdeposit = sc.nextDouble();
                    akun.deposit(inpdeposit);
                    break;
                case 2:
                    System.out.print("tolong masukkan jumlah : ");
                    Double inppenarikan = sc.nextDouble();
                    akun.penarikan(inppenarikan);
                    break;
                case 3:
                    akun.saldo();
                    break;
                case 4:
                    System.out.println("keluar dari program");
                    System.exit(0);
                default:
                    System.out.println("pilihan tidak ditemukan");

            }
        }
    }
}