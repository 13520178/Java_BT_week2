import java.util.Scanner;
public class ThanhVien {
// Khai báo thuộc tính
	private int maSo, diemCongHien,thuNhap;
	private String hoTen, ngaySinh, gioiTinh, chungToc;
	DuLieu duLieu = new DuLieu();
	
//Mã số
	public int getMaSo(){
		return maSo;
	}
	public void setMaSo(int ms){
		maSo = ms;
	}
	
//Diem cong hien
	public int getDiemCongHien(){
		return diemCongHien;
	}
	public void setDiemCongHien(int dch){
		diemCongHien = dch;
	}

//Thu nhap
	public int getThuNhap(){
		return thuNhap;
	}
	public void setThuNhap(int tn){
		thuNhap = tn;
	}
	
//Ho ten
	public String getHoTen(){
		return hoTen;
	}
	public void setHoTen(String ht){
		hoTen = ht;
	}
	
//Ngay Sinh
	public String getNgaySinh (){
		return ngaySinh;
	}
	public void setNgaySinh (String ns){
		ngaySinh = ns;
	}	
//Gioi tinh
	public String getGioiTinh(){
		return gioiTinh;
	}
	public void setGioiTinh(String gt){
		gioiTinh = gt;
	}
	
//Chung toc
	public String getChungToc(){
		return chungToc;
	}
	public void setChungToc(String ct){
		chungToc = ct;
	}
	

	
// Ham khoi tao
	public ThanhVien(){
		hoTen=gioiTinh=ngaySinh=chungToc="";
		maSo = diemCongHien = thuNhap =0;
	}
	
	public ThanhVien(String hoten, String ngaysinh, String gioitinh,
		String chungtoc, int maso,int diemconghien,
		int thunhap){
		hoTen = hoten;
		ngaySinh = ngaysinh ;
		gioiTinh = gioitinh;
		chungToc = chungtoc;
		
		maSo = maso;
		diemCongHien = diemconghien;
		thuNhap = thunhap;
	}
	public String nhapChungToc(){
		// Bien i là biến để chọn chung toc
			int i;
			@SuppressWarnings("resource")
			Scanner scanIn= new Scanner(System.in);
			do{
			
			
				System.out.println("Nhap chung toc(An so tuong ung)");
				System.out.print("1- Tinh Linh; 2- Dia Tinh; 3- Nguoi:");
				try{
					i= Integer.parseInt(scanIn.nextLine());
					if(i==1){
						chungToc="Tinh Linh";
					}
					else if(i==2){
						chungToc="Dia Tinh";
					}
					else if(i==3){
						chungToc = "Nguoi";
					}
					else{
						i=0;
					}
					
				}catch(Exception e){
					i=0;
				}
				if(i==0){
					System.out.println("***NHAP SAI***");
					System.out.println("Nhap lai:");
				}
			}while(i==0);
		return chungToc;
	}
// Ham nhap thong tin thanh vien
	public void nhap(){
	
		System.out.println("Nhap ma so: ");
		setMaSo(duLieu.nhapInt());
		System.out.println("Nhap ho ten: ");
		setHoTen(duLieu.nhapString());
		System.out.println("Nhap ngay sinh: ");
		setNgaySinh(duLieu.nhapString());
		System.out.println("Nhap gioi tinh: ");
		setGioiTinh(duLieu.nhapString());
		System.out.println("Nhap chung toc: ");
		setGioiTinh(nhapChungToc());
	}
	
		
	
	//Ham xuat thong tin thanh vien
	public void xuat(){
		System.out.println("Ma so:" + getMaSo()+".");
		System.out.println("Ho ten:" + getHoTen()+".");
		System.out.println("Ngay sinh:" + getNgaySinh()+".");
		System.out.println("Gioi tinh:" + getGioiTinh()+".");
		System.out.println("ChungToc:" + getChungToc()+".");
	}
	
		
}