import java.util.Scanner;

public class Nguoi extends ThanhVien {
	private int i; //Bien i là bien chon nghe nghiep
	Scanner scanIn= new Scanner(System.in);
	DuLieu duLieu = new DuLieu();
	private String ngheNghiep;
	private int chuyenXe, chuyenBaoAn, soi, gau, ho; 
	//Nghe Nghiep
		public String getNgheNghiep(){
			return ngheNghiep;
		}
		public void setNgheNghiep(String nn){
			ngheNghiep = nn;
		}
//các ham get set
	//chuyen xe
		public int getChuyenXe(){
			return chuyenXe;
		}
		public void setChuyenXe(int cx){
			chuyenXe= cx;
		}
	//chuyen bao an
		public int getChuyenBaoAn(){
			return chuyenBaoAn;
		}
		public void setChuyenBaoAn(int cba){
			chuyenBaoAn= cba;
		}
	//soi
		public int getSoi(){
			return soi;
		}
		public void setSoi(int s){
			soi= s;
		}
	//gau
		public int getGau(){
			return gau;
		}
		public void setGau(int g){
			gau= g;
		}
	//ho
		public int getHo(){
			return ho;
		}
		public void setHo(int h){
			ho= h;
		}
		public String nhapNgheNghiep(){
			do{
				try{
					i = Integer.parseInt(scanIn.nextLine());
				}catch(Exception e){
					i=0;
				}
				if(i==1){
					ngheNghiep ="Van chuyen do";
				}
				else if (i==2){
					ngheNghiep ="Bao an";
				}
				else{
					i=0;
				}
				if(i==0){
					System.out.println("**NHAP SAI**");
					System.out.println("Nhap lai:");
				}
			}while(i==0);
			return ngheNghiep;
		}
		public void tinhToan(){
			//Tinh tien va cong hien
			if(i==1){
			
				setDiemCongHien(getChuyenXe());
				setThuNhap(getChuyenXe());
				thuong(getThuNhap());
			}
			else if(i==2){
				int dem = chuyenBaoAn+ soi*2+ gau*3+ ho*4;
				setDiemCongHien(dem);
				setThuNhap(dem);
				thuong(getThuNhap());
				
			}
		}
		public void nhap(){
			super.nhap();
			System.out.println("Nhap nghe nghiep chon 1 hoặc 2");
			System.out.println("1-Van chuyen; 2- Bao an: ");
			setNgheNghiep(nhapNgheNghiep());
			if(i==1){
				System.out.print("So chuyen xe: ");
				setChuyenXe(duLieu.nhapInt());
			}
			else if(i==2){
				System.out.print("So chuyen bao an: ");
				setChuyenBaoAn(duLieu.nhapInt());
				System.out.println("Thu rung tieu giet duoc: ");
				System.out.print("Soi ");
				setSoi(duLieu.nhapInt());
				System.out.print("Gau: ");
				setGau(duLieu.nhapInt());
				System.out.print("Ho: ");
				setHo(duLieu.nhapInt());
			}	
			tinhToan();
		}	
		public void xuat(){
			super.xuat();
			System.out.println("Nghe nghiep: "+ngheNghiep+".");
			System.out.println("Cong hien: "+getDiemCongHien()+".");
			System.out.println("Thu nhap: "+getThuNhap()+".");
		}
}
