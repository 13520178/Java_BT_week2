import java.util.Scanner;

public class DiaTinh extends ThanhVien {
	private int i; //Bien i là bien chon nghe nghiep
	Scanner scanIn= new Scanner(System.in);
	DuLieu duLieu = new DuLieu();
	private String ngheNghiep;
	private String chungToc = "Dia Tinh";
	private int dungCuSX, vuKhi, aoGiap, bichNgoc, lamNgoc, hongNgoc, kimCuong; 
	
	
	//Nghe Nghiep
		public String getNgheNghiep(){
			return ngheNghiep;
		}
		public void setNgheNghiep(String nn){
			ngheNghiep = nn;
		}
	// Cac ham get set
		//So cay trong
		public int getDungCuSX(){
			return dungCuSX;
		}
		public void setDungCuSX(int dcsx){
			dungCuSX= dcsx;
		}
		
		// vu khi
		public int getVuKhi(){
			return vuKhi;
		}
		public void setVuKhi(int vk){
			vuKhi= vk;
		}
		
		//ao giap
		public int getAoGiap(){
			return aoGiap;
		}
		public void setAoGiap(int ag){
			aoGiap= ag;
		}
		
		//bich ngoc
		public int getBichNgoc(){
			return bichNgoc;
		}
		public void setBichNgoc(int bn){
			bichNgoc= bn;
		}
		//hong ngoc
		public int getHongNgoc(){
			return hongNgoc;
		}
		public void setHongNgoc(int hn){
			hongNgoc= hn;
		}
		//lam ngoc
		public int getLamNgoc(){
			return lamNgoc;
		}
		public void setLamNgoc(int ln){
			lamNgoc= ln;
		}
		
		//kim cuong
		public int getKimCuong(){
			return kimCuong;
		}
		public void setKimCuong(int kc){
			kimCuong= kc;
		}
		
		
		public String nhapNgheNghiep(){
			do{
				try{
					i = Integer.parseInt(scanIn.nextLine());
				}catch(Exception e){
					i=0;
				}
				if(i==1){
					ngheNghiep ="Tinh che do";
				}
				else if (i==2){
					ngheNghiep ="Tim quang";
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
				int dem =dungCuSX*1+ vuKhi*2+aoGiap*3;
				setDiemCongHien(dem);
				setThuNhap(dem);
				thuong(getThuNhap());
			}
			else if(i==2){
				int dem = bichNgoc*5+ lamNgoc*10+ hongNgoc*15+ kimCuong*20;
				setDiemCongHien(dem);
				setThuNhap(dem);
				thuong(getThuNhap());
				
			}
		}
		public void nhap(){
			super.nhap();
			System.out.println("Nhap nghe nghiep chon 1 hoặc 2");
			System.out.println("1-Tinh che do; 2- Tim quang: ");
			setNgheNghiep(nhapNgheNghiep());
			if(i==1){
				System.out.println("So do tinh che duoc: ");
				System.out.print("Dung cu san xuat: ");
				setDungCuSX(duLieu.nhapInt());
				System.out.print("Vu khi: ");
				setVuKhi(duLieu.nhapInt());
				System.out.print("Ao giap: ");
				setAoGiap(duLieu.nhapInt());
			}
			else if(i==2){
				System.out.println("So quang tim duoc (Vien): ");
				System.out.print("Bich ngoc: ");
				setBichNgoc(duLieu.nhapInt());
				System.out.print("Lam ngoc: ");
				setLamNgoc(duLieu.nhapInt());
				System.out.print("Hong ngoc: ");
				setHongNgoc(duLieu.nhapInt());
				System.out.print("Kim cuong: ");
				setKimCuong(duLieu.nhapInt());
			}
			tinhToan();
		}
		public void xuat(){
			super.xuat();
			System.out.println("Chung toc: "+chungToc+".");
			System.out.println("Nghe nghiep: "+ngheNghiep+".");
			System.out.println("Cong hien: "+getDiemCongHien()+".");
			System.out.println("Thu nhap: "+getThuNhap()+".");
		}
}
