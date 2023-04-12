package lab b5;

import java.util.Scanner;

public class SanPham {
    
    
    Scanner sc = new Scanner(System.in);
    private String tenSanPham ; 
    private Double donGia ;
    Double giamGia ;
    private Double thuenhapkhau ;

    void getThueNhapKhau(){
        
        thuenhapkhau = (donGia*10)/100;
 
    }
    public void xuat(){
        System.out.println("Tên Sản Phẩm : "+ tenSanPham);
        System.out.println("Giá Sản Phẩm : "+ donGia);
        System.out.println("Giảm Giá     : "+ giamGia);
        System.out.println("Tiền Thuế    : "+ thuenhapkhau);
        System.out.println("Số Tiền Phải Trả  : "+ (donGia-giamGia+thuenhapkhau));
        
        
        
    } 
    public Double getDonGia() {
        return donGia;
    }
    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
    public String getTenSanPham() {
        return tenSanPham;
    }
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    public Double getGiamGia() {
        return giamGia;
    }
    
    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }
    public Double getThuenhapkhau() {
        return thuenhapkhau;
    }
    public void setThuenhapkhau(Double thuenhapkhau) {
        this.thuenhapkhau = thuenhapkhau;
    }

    protected void nhap(){
        System.out.print("Tên Sản Phẩm : ");
        tenSanPham = sc.nextLine();
        System.out.print("Giá Sản Phẩm : ");
        donGia = sc.nextDouble();
        System.out.print("Giảm Giá     : ");
        giamGia = sc.nextDouble();
    }
    public SanPham(){}
    public SanPham(String tenSanPham , Double donGia, Double giamGia){
        this.tenSanPham = tenSanPham ;
        this.donGia = donGia ;
        this.giamGia = giamGia ;
        
    }
    public SanPham(String tenSanPham , Double donGia ){
        this(tenSanPham, donGia, (double) 0);

    }
    
}