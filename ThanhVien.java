
public class ThanhVien {
// Khai bao thuoc tinh
	private int maSo, diemCongHien,thuNhap;
	private String hoTen, ngaySinh, gioiTinh;
	DuLieu duLieu = new DuLieu();
	
//Ma so
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
	

	

	
// Ham khoi tao
	public ThanhVien(){
		hoTen=gioiTinh=ngaySinh="";
		maSo = diemCongHien = thuNhap =0;
	}
	
	public ThanhVien(String hoten, String ngaysinh, String gioitinh,
		String chungtoc, int maso,int diemconghien,
		int thunhap){
		hoTen = hoten;
		ngaySinh = ngaysinh ;
		gioiTinh = gioitinh;
		
		
		maSo = maso;
		diemCongHien = diemconghien;
		thuNhap = thunhap;
	}
	
//	
	public int thuong(int dch){
		if(diemCongHien>3000){
			thuNhap=thuNhap+600;
			}
		if(2000<=diemCongHien&&diemCongHien<=3000){
			thuNhap=thuNhap+300;
		}
		return thuNhap;
	}
// Ham nhap thong tin thanh vien
	public void nhap(){
	
		System.out.print("Nhap ma so: ");
		setMaSo(duLieu.nhapInt());
		System.out.print("Nhap ho ten: ");
		setHoTen(duLieu.nhapString());
		System.out.print("Nhap ngay sinh: ");
		setNgaySinh(duLieu.nhapString());
		System.out.print("Nhap gioi tinh: ");
		setGioiTinh(duLieu.nhapString());
		
	}
	
		
	
	//Ham xuat thong tin thanh vien
	public void xuat(){
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("Ma so:" + getMaSo()+".");
		System.out.println("Ho ten:" + getHoTen()+".");
		System.out.println("Ngay sinh:" + getNgaySinh()+".");
		System.out.println("Gioi tinh:" + getGioiTinh()+".");
		
	}
	
		
}
