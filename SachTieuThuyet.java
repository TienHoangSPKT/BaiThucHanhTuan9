package BTTHLTHDT;
public class SachTieuThuyet extends Sach implements IKiemKe{
    protected String theLoai;
    protected boolean laSachSeries;
    protected String viTri;

    public void settheLoai(String theLoai){
        this.theLoai=theLoai;
    }
    public void setlaSachSeries(boolean laSachSeries){
        this.laSachSeries = laSachSeries;
    }

    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public String gettheLoai(){
        return theLoai;
    }
    public boolean getlaSachSeries(){
        return laSachSeries;
    }

    public SachTieuThuyet(){}
    public SachTieuThuyet(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong,double giaCoBan,String theLoai,boolean laSachSeries,String viTri){
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
        this.theLoai=theLoai;
        this.laSachSeries=laSachSeries;
        this.viTri=viTri;
    }

    @Override
    public String toString(){
        return "Sach Giao Trinh [ Ma Sach = " + maSach +", Tieu De =" + tieuDe + ", Tac Gia = " + tacGia + ", Nam Xuat Ban =" + namXuatBan + ", So Luong ="+ soLuong +", The Loai ="+ theLoai +",laSachseries ="+ laSachSeries +",Gia ban la " +tinhGiaBan();
    }
    @Override
    public double tinhGiaBan(){
        if(laSachSeries == true){
            return giaCoBan+15.000;
        }else{
            return giaCoBan;
        }
    }
    @Override 
    public boolean kiemTraTonKho(int soLuongToiThieu){
        if(soLuong>=soLuongToiThieu){
            return true;
        }else{
            return false;
        }
    }
    @Override 
    public void capNhatViTri(String viTriMoi){
        this.viTri=viTriMoi;
        System.out.println("Da chuyen "+gettieuDe()+"den khu vuc :"+ viTriMoi);
    }
}
