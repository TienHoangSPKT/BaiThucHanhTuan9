package BTTHLTHDT;

import java.util.Scanner;

public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    protected Scanner sc=new Scanner(System.in);

    public String getmaSach(){
        return maSach;
    }
    public String gettieuDe(){
        return tieuDe;
    }
    public String gettacGia(){
        return tacGia;
    }
    public int getnamXuatBan(){
        return namXuatBan;
    }
    public int getsoLuong(){
        return soLuong;
    }
    public double getgiaCoBan(){
        return giaCoBan;
    }

    public void setmaSach(String maSach){
        this.maSach=maSach;
    }
    public void settieuDe(String tieuDe){
        this.tieuDe=tieuDe;
    }
    public void settacGia(String tacGia){
        this.tacGia=tacGia;
    }
    public void setnamXuatBan(int namXuatBan){
        this.namXuatBan=namXuatBan;
    }
    public void setsoLuong(int soLuong ){
        this.soLuong=soLuong;
    }
    public void setgiaCoBan(double giaCoBan){
        this.giaCoBan=giaCoBan;
    }
    public Sach(){
        maSach="";
        tieuDe="";
        tacGia="";
        namXuatBan=0;
        soLuong=0;
    }
    public Sach(String maSach,String tieuDe,String tacGia,int namXuatBan,int soLuong,double giaCoBan){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
        this.giaCoBan=giaCoBan;
    }
    
    public void Nhap(){
        System.out.println("Nhap ma sach :");
        this.maSach = sc.nextLine();
        System.out.println("Nhap tieu de :");
        this.tieuDe = sc.nextLine();
        System.out.println("Nhap tac gia :");
        this.tacGia = sc.nextLine();
        System.out.println("Nhap nam xuat ban :");
        this.namXuatBan=sc.nextInt();
        System.out.println("Nhap so Luong :");
        this.soLuong = sc.nextInt();

    }
    public void HienThiThongTin(){
        System.out.println("Ma Sach :" + maSach);
        System.out.println("Tieu De :" + tieuDe);
        System.out.println("Tac Gia :" + tacGia);
        System.out.println("Nam Xuat Ban :" + namXuatBan);
        System.out.println("So Luong " + soLuong);
        System.out.println("Gia Ban Uoc Tinh :"+tinhGiaBan()+"VND");
    }
    public abstract double tinhGiaBan();
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);
    public abstract void capNhatViTri(String viTriMoi);
}
