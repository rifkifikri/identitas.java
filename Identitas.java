import java.util.Scanner;

public class Identitas {
	public static void main(String[] args) {
		Scanner inputan= new Scanner(System.in);
		String nama,alamat,nomorHandphone;
		
		System.out.print("masukkan nama :");
		nama=inputan.nextLine();//nexline untuk mengambil semua yang ada dalam satu baris. semisal nama dengan spasi
		System.out.print("masukkan alamat anda :");
		alamat=inputan.nextLine();
		System.out.print("masukkan nomor anda :");
		nomorHandphone=inputan.nextLine();
		System.out.println("namanya adalah " + nama);
		System.out.println("alamat anda " + alamat);
		System.out.println("nomor anda adalah " + nomorHandphone);
	}
}
