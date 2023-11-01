package abid;

import java.util.Scanner;
public class Abid {

    public static void main(String[] args) {
        //operator penugasan
        Scanner tugas = new Scanner(System.in);
       int a,b,hasil;
        System.out.println("==========================================================================");
        System.out.println("///operator pengurangan");
        System.out.print("masukkan angka 1:"); 
        a = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        b = tugas.nextInt();
        hasil=a-=b;
        System.out.println("hasilnya ="+hasil); 
        System.out.println("//");
        System.out.println("//");
        System.out.println("//");
        
          System.out.println("operator penambahan");
        System.out.print("masukkan angka 1:"); 
        a = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        b = tugas.nextInt();
        hasil=a += b;
        System.out.println("hasilnya ="+hasil);
        System.out.println("//");
        System.out.println("//");
                
          System.out.println("operator perkalian");
        System.out.print("masukkan angka 1:"); 
        a = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        b = tugas.nextInt();
        hasil=a *= b;
        System.out.println("hasilnya ="+hasil);
        System.out.println("//");
        System.out.println("//");
        
          System.out.println("operator pembagian");
        System.out.print("masukkan angka 1:"); 
        a = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        b = tugas.nextInt();
        hasil=a /= b;
        System.out.println("hasilnya ="+hasil);
        System.out.println("//");
        System.out.println("//");
        
          System.out.println("operator sisa bagi");
        System.out.print("masukkan angka 1:"); 
        a = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        b = tugas.nextInt();
        hasil=a %= b;
        System.out.println("hasilnya ="+hasil);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("==========================================================================");
        
        System.out.println("///operator pembanding");
        System.out.println("operator lebih besar");
        System.out.print("masukkan angka 1:"); 
        float j = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float k = tugas.nextInt();
        boolean hasil1;
        hasil1=j>k;
        System.out.println("hasilnya ="+hasil1);
        System.out.println("//");
        System.out.println("//");
       
        System.out.println("///operator lebih kecil");
        System.out.print("masukkan angka 1:"); 
        float q = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float w = tugas.nextInt();
        boolean hasil2;
        hasil1=q<w;
        System.out.println("hasilnya ="+hasil1);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("///operator sama dengan");
        System.out.print("masukkan angka 1:"); 
        float e = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float r = tugas.nextInt();
        boolean hasil8;
        hasil8=e==r;
        System.out.println("hasilnya ="+hasil8);
        System.out.println("//");
        System.out.println("//");
         
         System.out.println("///operator tidak sama dengan");
        System.out.print("masukkan angka 1:"); 
        float p = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float t= tugas.nextInt();
        boolean hasil3;
        hasil3=p!=t;
        System.out.println("hasilnya ="+hasil3);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("///operator lebih besar sama dengan");
        System.out.print("masukkan angka 1:"); 
        float u = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float z= tugas.nextInt();
        boolean hasil4;
        hasil4=u>=z;
        System.out.println("hasilnya ="+hasil4);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("///operator lebih kecil sama dengan");
        System.out.print("masukkan angka 1:"); 
        float y = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        float i= tugas.nextInt();
        boolean hasil5;
        hasil5=y<=i;
        System.out.println("hasilnya ="+hasil5);
        System.out.println("//");
        System.out.println("//");


        System.out.println("==========================================================================");

        System.out.println("////operator bitwise");
        
//        System.out.println(" ** Operator Bitwise **");
        System.out.println("==========================================================================");
        System.out.println("Fungsi AND");
        int c, d, total1;
        
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        d = tugas.nextInt();
        //fungsi and
        total1 = c & d;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");
        

          System.out.println("fungsi OR");  
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        d = tugas.nextInt();
        total1 = c | d;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");

        System.out.println("fungsi XOR");
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        System.out.print("masukkan angka 2:"); 
        d = tugas.nextInt();
        total1 = c ^ d;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");

        System.out.println("fungsi negasi/kebalikan");
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        total1 = ~c;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("fungsi leftshift");
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        total1 = c << 3;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("fungsi rightshift");
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        total1 = c >> 3;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");

        System.out.println("fungsi rightshift(unsigned)");
        System.out.print("masukkan angka 1:"); 
        c = tugas.nextInt();
        total1 = c >>> 3;
        System.out.println("hasilnya ="+total1);
        System.out.println("//");
        System.out.println("//");
        
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        

////        

    }
    
}
