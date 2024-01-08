import java.util.Scanner;

public class UlanganHarian {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sekolah;
        double siswa,bekerja,kuliah,wirausaha,belumBeraktivitas,prosentase;
       
        
        System.out.println("Keterangan Alumni");
        System.out.print("Masukkan nama sekolah : ");
        sekolah = input.nextLine();
        System.out.print("Masukkan jumlah siswa : ");
        siswa = input.nextDouble();
        System.out.print("Masukkan jumlah siswa yang bekerja : ");
        bekerja = input.nextDouble();
        System.out.print("Masukkan jumlah siswa yang kuliah : ");
        kuliah = input.nextDouble();
        System.out.print("Masukkan jumlah siswa yang berwirausaha : ");
        wirausaha = input.nextDouble();
         belumBeraktivitas = siswa-bekerja-kuliah-wirausaha;
         prosentase = belumBeraktivitas/siswa*100/100 ;
        
        System.out.println("===================================================");
        
        System.out.println(""+sekolah);
        
        System.out.println("Yang memilih bekerja = "+bekerja);
        System.out.println("Yang memilih kuliah = "+kuliah);
        System.out.println("Yang memilih berwirausaha = "+wirausaha);
        System.out.println("Yang belum memilih aktivitas = "+belumBeraktivitas);
        System.out.println("Prosentase yang belum memilih aktivitas = "+prosentase);
        
        
    }
}
