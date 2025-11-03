package BTTHLTHDT;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {
        QuanLySachImpl qls = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int luaChon = -1;
        do {
            System.out.println("\n========= MENU QUAN LY THU VIEN =========");
            System.out.println("1. Them moi sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim kiem sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Cap nhat thong tin sach theo ma");
            System.out.println("6. Kiem tra ton kho");
            System.out.println("7. Cap nhat vi tri moi");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("=========================================");
            System.out.print(">> Vui long chon chuc nang: ");
            try {
                luaChon = sc.nextInt();
                sc.nextLine(); 
                switch (luaChon) {
                    case 1:
                        qls.ThemSach();
                        break;
                    case 2:
                        qls.HienThiDanhSach();
                        break;
                    case 3:
                        System.out.print("Nhap ma sach can tim: ");
                        String maTim = sc.nextLine();
                        Sach sachTim = qls.TimKiem(maTim);
                        if (sachTim != null) {
                            System.out.println("Da tim thay sach:");
                            System.out.println(sachTim);
                        } else {
                            System.out.println("Khong tim thay sach co ma " + maTim);
                        }
                        break;
                    case 4:
                        System.out.print("Nhap ma sach can xoa: ");
                        String maXoa = sc.nextLine();
                        qls.Xoa(maXoa);
                        break;
                    case 5:
                        System.out.print("Nhap ma sach can cap nhat: ");
                        String maCapNhat = sc.nextLine();
                        qls.CapNhat(maCapNhat);
                        break;
                    case 6:
                        System.out.print("Nhap ma sach can kiem tra ton kho: ");
                        String makttk = sc.nextLine();
                        Sach kttt=qls.TimKiem(makttk);
                        if (kttt != null) {
                            System.out.print("Nhap so luong toi thieu cua sach: ");
                            int soLuongToiThieu = sc.nextInt();
                            System.out.println("Ket qua kiem ke: "+ kttt.kiemTraTonKho(soLuongToiThieu));
                        }  
                        else{
                            System.out.println("Khong tim thay sach co ma " + makttk);
                        }
                        break;
                    case 7:
                        System.out.print("Nhap ma sach can chuyen vi tri: ");
                        String macvt=sc.nextLine();
                        Sach cvt=qls.TimKiem(macvt);
                        if (cvt != null) {
                            System.out.print("Nhap vi tri moi can chuyen den: ");
                            String viTriMoi= sc.nextLine();
                            cvt.capNhatViTri(viTriMoi);
                        }
                        else{
                            System.out.println("Khong tim thay sach co ma " + macvt);
                        }
                        break;
                    case 0:
                        System.out.println("Cam on ban da su dung chuong trinh!");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le. Vui long chon lai.");
                }
            } catch (Exception e) {
                System.out.println("Du lieu nhap vao khong hop le. Vui long thu lai.");
                sc.nextLine(); 
            }
        } while (luaChon != 0);
        sc.close();
    }
}