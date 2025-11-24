import java.util.Scanner;

public abstract class Sach1 implements IkiemKe,IgiaBan{
    private String Masach;
    private String TieuDe;
    private String Tacgia;
    private int NamXuatBan;
    protected int Soluong;
    protected int giaCoBan;
    protected String viTri;
    protected Scanner sc = new Scanner(System.in);
    public Sach1()
    {
        Masach="";
        TieuDe="";
        Tacgia="";
        NamXuatBan=0;
        Soluong=0;
    }
    public Sach1(String Masach, String TieuDe, String Tacgia, int NamXuatBan, int Soluong, int giaCoBan,String viTri)
    {
        this.Masach= Masach ;
        this.TieuDe= TieuDe;
        this.Tacgia= Tacgia;
        this.NamXuatBan= NamXuatBan;
        this.Soluong= Soluong;
        this.giaCoBan= giaCoBan;
        this.viTri=viTri;
    }
    public void nhapThongTin() 
    {
        System.out.print("Nhap ma sach: ");
        Masach = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        TieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        Tacgia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        NamXuatBan = sc.nextInt();
        System.out.print("Nhap so luong: ");
        Soluong = sc.nextInt();
        System.out.print("Gia co ban :");
        giaCoBan = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap vi tri: ");
        this.viTri =sc.nextLine();
    }
    @Override
    public String toString() {
        return "Ma sach: " + Masach + ", Tieu de: " + TieuDe + ", Tac gia: " + Tacgia + ", Nam XB: " + NamXuatBan + ", So luong: " + Soluong + ", Gia co ban"+ giaCoBan+ ", Vi tri";
    }
    public String getMasach() {
        return Masach;
    }
    public String getTieuDe() {
        return TieuDe;
    }
    public String getTacgia() {
        return Tacgia;
    }
    public int getNamXuatBan() {
        return NamXuatBan;
    }
    public int getSoluong() {
        return Soluong;
    }
    public int getGiaCoBan() {
        return giaCoBan;
    }
    public void setMasach(String masach) {
        this.Masach = masach;
    }
    public void setTieuDe(String tieuDe) {
        this.TieuDe = tieuDe;
    }
    public void setTacgia(String tacgia) {
        this.Tacgia = tacgia;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.NamXuatBan = namXuatBan;
    }
    public void setSoluong(int soluong) {
        this.Soluong = soluong;
    }
    public void setGiaCoBan(int giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    public abstract double tinhGiaBan();
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);
    public abstract void capNhatViTri(String viTriMoi);
}
