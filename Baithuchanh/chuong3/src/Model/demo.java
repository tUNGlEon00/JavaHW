package Model;
import util.Configs;

public class demo {
    public static void main(String[] args)
    {
     //khoi tao cac doi tuong

     NhanVienFullTime sep = new NhanVienFullTime(" Le Thanh Tung ", 100);
     sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);

     NhanVienFullTime linh0 = new NhanVienFullTime("Cao Thanh Ha", 9);
     linh0.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

     NhanVienPartTime ok = new NhanVienPartTime("Gcaothu", 22);
     
     // tinh luong 

     sep.tinhLuong();
     linh0.tinhLuong();
     ok.tinhLuong();

     // xuat thong tin

     sep.xuatThongTin();
     linh0.xuatThongTin();
     ok.xuatThongTin();
    }
}
