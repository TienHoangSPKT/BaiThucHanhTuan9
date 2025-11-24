public class SachGiaoTrinh extends Sach1{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh()
    {
        super();
    }
    public SachGiaoTrinh(String Masach,String TieuDe,String Tacgia,int NamXuatBan, int Soluong, String viTri, int giaCoBan,String Monhoc, String Capdo)
    {
        super(Masach, TieuDe, Tacgia, NamXuatBan, Soluong, giaCoBan, viTri);
        this.monHoc=Monhoc;
        this.capDo=Capdo;
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap mon hoc: ");
        this.monHoc = sc.nextLine();
        System.out.print("Nhap cap do (Dai hoc/Pho thong): ");
        this.capDo = sc.nextLine();
    }
    @Override
    public double tinhGiaBan(){
        return getGiaCoBan() + ((2025-getNamXuatBan())*5000);
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
        System.out.println("Da chuyen sach " +getTieuDe()+ " den khu vuc :" + viTriMoi);
    }
    @Override
    public String toString()
    {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo + ", Gia ban:" + tinhGiaBan();
    }
}