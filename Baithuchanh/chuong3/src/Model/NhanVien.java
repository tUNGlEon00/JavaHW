package Model;

public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){}
    public NhanVien(String ten){ this.ten = ten; }
    protected String loaiNhanVien (){
        return " day la nhan vien ";
    }
    public void xuatThongTin()
    {
        System.out.println(" Thong tin cua nhan vien la: ");
        System.out.println(" ten: "+ten);
        System.out.println(" thuoc loai nhan vien: "+loaiNhanVien());
        System.out.println(" luong: "+luong+" VND ");
    }  
}
