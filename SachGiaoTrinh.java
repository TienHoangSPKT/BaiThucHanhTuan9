package BTTHLTHDT;
public class SachGiaoTrinh extends Sach implements IKiemKe{
    protected String monHoc;
    protected String capDo;
    protected String viTri;

    public String getmonHoc(){
        return monHoc;
    }
    public String getcapDo(){
        return capDo;
    }
    
    public String getViTri() {
        return viTri;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public void setmonHoc(String monHoc){
        this.monHoc=monHoc;
    }
    public void setcapDo(String capDo){
        this.capDo=capDo;
    }

    public SachGiaoTrinh(){
        super();
    }
    public SachGiaoTrinh(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong,double giaCoBan,String monHoc,String capDo,String viTri){
        super(maSach,tieuDe,tacGia,namXuatBan,soLuong,giaCoBan);
        this.monHoc=monHoc;
        this.capDo=capDo;
        this.viTri=viTri;
    }
    @Override
    public String toString() {
        return "SachGiaoTrinh [maSach=" + maSach + ", monHoc=" + monHoc + ", tieuDe=" + tieuDe + ", capDo=" + capDo
                + ", tacGia=" + tacGia + ", namXuatBan=" + namXuatBan + ", soLuong=" + soLuong + ", Gia Ban "+tinhGiaBan()+"]";
    }
    @Override 
    public double tinhGiaBan(){
        return giaCoBan+(2025-this.namXuatBan);
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
