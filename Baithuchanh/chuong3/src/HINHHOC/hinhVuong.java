package HINHHOC;
import java.util.Scanner;

public class hinhVuong  extends hinhChuNhat{
     
     public hinhVuong()
     {
        ten = "hinh vuong";
        chuVi = 2.14f;
        dienTich = 2;
        theTich = 3;
     }

     public void nhapCanh()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println(" canh = ");
        dai = rong = sc.nextFloat();
     }

}
