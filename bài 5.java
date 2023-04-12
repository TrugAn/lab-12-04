package lab_2;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class DanhSachSoThuc {
​private ArrayList<Double>list;
 
​public DanhSachSoThuc(ArrayList<Double> list) {
​​this.list = list;
​}
 
​public DanhSachSoThuc() {
​​this.list=new ArrayList<Double>();
​}
​
​public void nhap() {
​​while(true) {
​​​Scanner sc=new Scanner(System.in);
​​​System.out.println("nhập Y để nhập số , N để dừng");
​​​String s=sc.nextLine();
​​​if(s.equalsIgnoreCase("N"))
​​​​break;
​​​else if(s.equalsIgnoreCase("Y")) {
​​​​System.out.println("Nhập số thực ");
​​​​double x=sc.nextDouble();
​​​​this.list.add(x);
​​​}else {
​​​​System.out.println("Nhập lại Y or N");
​​​}
​​}
​}
​
​public void xuat() {
​​for (Double double1 : list) {
​​​System.out.println(double1);
​​}
​}
​
​public void tinhTong() {
​​double tong=0;
​​for (Double double1 : list) {
​​​tong+=double1;
​​}
​​System.out.println("tổng = "+tong);
​}
​
​
}
 
package lab_2;
public class Test_Bai_1 {
public static void main(String[] args) {
DanhSachSoThuc list=new DanhSachSoThuc();
list.nhap();
list.xuat();
list.tinhTong();
}
}
package lab_3_HamCollections_QuanTrong;
import java.util.Scanner;
public class HoTen implements Comparable<HoTen>{
private String hoVaTen;
public HoTen() {
}
public HoTen(String hoVaTen) {
this.hoVaTen = hoVaTen;
}
public String getHoVaTen() {
return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
this.hoVaTen = hoVaTen;
}
@Override
public String toString() {
return "HoTen [hoVaTen=" + hoVaTen + "]";
}
public void nhap() {
Scanner sc=new Scanner(System.in);
System.out.println("Nhập họ và tên");
this.setHoVaTen(sc.nextLine());
}
public String getTen() {
String s=this.hoVaTen.trim();
if(s.indexOf(" ")>=0) {
int vt=s.lastIndexOf(" ");
return s.substring(vt+1);
}else {
return s;
}
}
@Override
public int compareTo(HoTen o) {
return this.hoVaTen.compareTo(o.hoVaTen);
}
}
 
 
package lab_3_HamCollections_QuanTrong;
 
import java.util.ArrayList;
import java.util.Collections;
 
public class DanhSachHoTen {
​private ArrayList<HoTen>list;
​HoTen ht;
 
​public DanhSachHoTen(ArrayList<HoTen> list) {
​​this.list = list;
​}
 
​public DanhSachHoTen() {
​​this.list=new ArrayList<HoTen>();
​}
​
​public void nhap(HoTen ht) {
​​this.list.add(ht);
​}
​
​public void xuat() {
​​for (HoTen hoTen : list) {
​​​System.out.println(hoTen);
​​}
​}
​
​public void NgauNhien() {
​​Collections.shuffle(list);
​​// hoán đổi phần tử ngẫu nhiên
​}
​
​public void sapXepGiamDan() {
​​Collections.sort(list);
​​Collections.reverse(list);
​​//đảo ngược phần tử trong arraylist
​}
​
​public boolean xoaTheoTen(String ten) {
​​for(int i=0;i<this.list.size();i++) {
​​​ht=this.list.get(i);
​​​if(ht.getHoVaTen().equalsIgnoreCase(ten)) {
​​​​System.out.println("Đã xóa "+ht.getHoVaTen());
​​​​this.list.remove(i);
​​​​return true;
​​​}
​​}
​​System.out.println("không có họ và tên vừa nhập ");
​​return false;
​}
}
 
package lab_3_HamCollections_QuanTrong;
import java.util.Scanner;
public class Menu {
DanhSachHoTen list = new DanhSachHoTen();
HoTen ht;
Scanner sc = new Scanner(System.in);
public void menu() {
int chon = 0;
do {
System.out.println("1.Nhập danh sách họ và tên ");
System.out.println("2.Xuất danh sách vừa nhập ");
System.out.println("3.Xuất danh sách ngẫu nhiên");
System.out.println("4.Sắp xếp giảm dần và xuất danh sách ");
System.out.println("5.Tìm và xóa họ tên nhập từ bàn phím");
System.out.println("6.Kết thúc");
chon = sc.nextInt();
sc.nextLine();
if (chon == 1) {
ht=new HoTen();
ht.nhap();
this.list.nhap(ht);
} else if (chon == 2) {
this.list.xuat();
} else if (chon == 3) {
this.list.NgauNhien();
this.list.xuat();
} else if (chon == 4) {
this.list.sapXepGiamDan();
this.list.xuat();
} else if (chon == 5) {
System.out.println("Nhập họ và tên bạn muốn xóa");
String ten=sc.nextLine();
System.out.println("Đã xóa : "+this.list.xoaTheoTen(ten));
} else if (chon == 6) {
System.out.println("Bạn đã thoát !");
} else {
System.out.println("Vui lòng chọn đúng menu !");
}
} while (chon != 6);
}
}
 
 
package lab_3_HamCollections_QuanTrong;
public class Test {
public static void main(String[] args) {
lab_3_HamCollections_QuanTrong.Menu menu =new lab_3_HamCollections_QuanTrong.Menu();
menu.menu();
}
}
package lab_4;
import java.util.Scanner;
public class SanPham {
private String tenSP;
private double gia;
public SanPham() {
}
public SanPham(String tenSP, double gia) {
super();
this.tenSP = tenSP;
this.gia = gia;
}
public String getTenSP() {
return tenSP;
}
public void setTenSP(String tenSP) {
this.tenSP = tenSP;
}
public double getGia() {
return gia;
}
public void setGia(double gia) {
this.gia = gia;
}
@Override
public String toString() {
return "SanPham [tenSP=" + tenSP + ", gia=" + gia + "]";
}
public void nhap() {
Scanner sc=new Scanner(System.in);
System.out.println("nhập tên sản phảm");
this.setTenSP(sc.nextLine());
System.out.println("Nhập giá ");
this.setGia(sc.nextDouble());
}
}
 
 
 
 
package lab_4;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
public class QuanLySanPham {
​private ArrayList<SanPham>list;
​SanPham sp;
 
​public QuanLySanPham() {
​​this.list=new ArrayList<SanPham>();
​}
 
​public QuanLySanPham(ArrayList<SanPham> list) {
​​this.list = list;
​}
​
​public void nhap(SanPham sp) {
​​this.list.add(sp);
​}
​
​public void xuat() {
​​for (SanPham sanPham : list) {
​​​System.out.println(sanPham);
​​}
​}
​
​public void sapXepGiamDan_TheoGia() {
​​Collections.sort(this.list,new Comparator<SanPham>() {
 
​​​@Override
​​​public int compare(SanPham o1, SanPham o2) {
​​​​if(o1.getGia()>o2.getGia())
​​​​​​return -1;
​​​​else if(o1.getGia()<o2.getGia())
​​​​​​return 1;
​​​​else
​​​​​return 0;
​​​}
​​});
​}
​
​public boolean xoa_TheoTen(String ten) {
​​for(int i=0;i<this.list.size();i++) {
​​​sp=this.list.get(i);
​​​if(sp.getTenSP().equalsIgnoreCase(ten)) {
​​​​System.out.println("Đã xóa "+sp.getTenSP());
​​​​this.list.remove(i);
​​​​return true;
​​​}
​​}
​​return false;
​}
​
​public void xuatGiaTriTrungBinh() {
​​double tong=0;
​​int count=0;
​​for (SanPham sanPham : list) {
​​​tong+=sanPham.getGia();
​​​count++;
​​}
​​System.out.println("Trung bình = "+tong/count);
​}
}
 
package lab_4;
import java.util.Scanner;
public class MenuSanPham {
QuanLySanPham list=new QuanLySanPham();
SanPham sp;
public void menu() {
int chon=0;
Scanner sc=new Scanner(System.in);
do {
System.out.println("1.Nhập danh sách sản phẩm từ bàn phím");
System.out.println("2.Sắp xếp giảm dần theo giá và xuất ra màn hình");
System.out.println("3.Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
System.out.println("4.Xuất giá trung bình của các sản phẩm");
System.out.println("0.Thoát");
chon=sc.nextInt();
sc.nextLine();
if(chon==1) {
sp=new SanPham();
sp.nhap();
this.list.nhap(sp);
}else if(chon==2) {
this.list.sapXepGiamDan_TheoGia();
this.list.xuat();
}else if(chon==3) {
System.out.println("nhập tên sản phẩm muốn xóa");
String sp=sc.nextLine();
System.out.println("Đã xóa : "+this.list.xoa_TheoTen(sp));
}else if(chon==4) {
this.list.xuatGiaTriTrungBinh();
}else if(chon==0){
System.out.println("Bạn đã thoát !");
}else {
System.out.println("Vui lòng chọn menu !");
}
}while(chon!=0);
}
}
 
 
package lab_4;
public class Test_Bai4 {
public static void main(String[] args) {
MenuSanPham menu=new MenuSanPham();
menu.menu();
}
}