package BTTHLTHDT;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySachImpl implements IQuanLySach{
    private ArrayList<Sach> danhSach= new ArrayList<>();
    protected Scanner sc=new Scanner(System.in);
    @Override
    public void ThemSach(){
        System.out.println("Nhap Sach Muon Them ");
        System.out.println("1. Sach Giao Trinh ");
        System.out.println("2. Sach Tieu Thuyet ");
        System.out.println("Chon :");
        int chon=sc.nextInt();
        Sach sachMoi;
        if(chon==1){
            sachMoi = new SachGiaoTrinh();
        }else{
            sachMoi = new SachTieuThuyet();
        }
        System.out.println("Nhap Thong Tin Danh Sach ");
        sachMoi.Nhap();
        danhSach.add(sachMoi);
        System.out.println("Them thanh cong ");
    }
    @Override
    public void HienThiDanhSach(){
        if(danhSach.isEmpty()){
            System.out.println("Danh sach rong");
        }else{
            for (Sach s: danhSach){
                System.out.println(s);
            }
        }
    }
    @Override
    public Sach TimKiem(String maSach){
        for(Sach s:danhSach)
        {
            if(s.getmaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
        return null;
    }
    @Override
    public void Xoa(String maSach){
        Sach sachcanxoa=TimKiem(maSach);
        if(sachcanxoa!=null){
            danhSach.remove(sachcanxoa);
            System.out.println("Da Xoa sach co ma " + maSach);
        }else{
            System.out.println("Khong tim thay ");
        }
    }
    @Override
    public void CapNhat(String maSach){
        Sach sachcapnhat=TimKiem(maSach);
        if(sachcapnhat!=null){
            System.out.println("Nhap thong tin muon thay doi");
            sachcapnhat.Nhap();
            System.out.println("Da cap nhat thanh cong ");
        }else{
            System.out.println("Khong tim thay ");
        }
    }

}

