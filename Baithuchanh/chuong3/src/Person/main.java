package Person;

public class main {
    public static void main(String[] args) throws Exception {
        // Person
        person p = new person();
        p.xuatThongTin("Decade", 19, 987, "Tokyo");

        //Employer
        employee e = new employee();
        e.xuatThongTin();
        
    
        // Fulltime
        fullTime ft = new fullTime();
        ft.nhapDoanhSo();
        ft.tinhLuongCung();
        ft.tinhLuongThuong();
        ft.tinhLuong();
        ft.hienthiLuong();

        // part time 
        partTime pt = new partTime();
        pt.nhapluong1Gio();
        pt.nhapSoGio();
        pt.tinhLuong();
}
}