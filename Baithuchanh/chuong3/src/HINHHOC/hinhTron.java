package HINHHOC;
import java.util.Scanner;

public class hinhTron extends hinhHoc {

    public float banKinh;

    public hinhTron ()
    {
        ten = " hinh tron ";
        chuVi = 24;
        dienTich = 32;
    }

    public void nhapBanKinh ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ban kinh = ");
        banKinh = sc.nextFloat();
    }

    public void tinhCV ()
    {
        chuVi = 2*PI*banKinh;
    }

    public void tinhDT ()
    {
        dienTich = PI*banKinh*banKinh;
    }
    
}
