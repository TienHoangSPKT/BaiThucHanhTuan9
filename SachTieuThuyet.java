public class SachTieuThuyet extends Sach1{
    private String theLoai;
    private boolean isSachSeries;
    public SachTieuThuyet() {
        super();
    }
    public SachTieuThuyet(String Masach,String TieuDe,String Tacgia,int NamXuatBan, int Soluong, int giaCoBan, String viTri, String theLoai, boolean isSachSeries){
        super( Masach, TieuDe,Tacgia, NamXuatBan, Soluong, giaCoBan, viTri);
        this.theLoai=theLoai;
        this.isSachSeries=isSachSeries;
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        sc.nextLine();
        System.out.print("Nhap the loai: ");
        this.theLoai = sc.nextLine();
        System.out.print("Co phai la sach bo nhieu tap (series) khong (true/false): ");
        this.isSachSeries = sc.nextBoolean();
    }
    @Override 
    public double tinhGiaBan(){
        if (isSachSeries == true) {
            return getGiaCoBan()+ 15000;
        }
        else
            return getGiaCoBan();
    }
    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai + ", La sach series: " + isSachSeries+ ", Gia ban: " + tinhGiaBan();
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        if (Soluong >= soLuongToiThieu) {
            return true;
        }
        else
            return false;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri=viTriMoi;
        System.out.println("Da chuyen sach " +getTieuDe()+ " den khu vuc : " + viTriMoi);
    }
}
