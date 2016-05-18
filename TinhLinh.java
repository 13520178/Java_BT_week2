import java.util.Scanner;
public class TinhLinh extends ThanhVien {
	int i; //Bien i là bien chon nghe nghiep
	DuLieu duLieu = new DuLieu();
	private String ngheNghiep;
	private int soCayTrong, linhChi, haThuO, nhanSam, thatTamLien;
	//Nghe Nghiep
		public String getNgheNghiep(){
			return ngheNghiep;
		}
		public void setNgheNghiep(String nn){
			ngheNghiep = nn;
		}
	// Cac ham get set
		//So cay trong
		public int getSoCayTrong(){
			return soCayTrong;
		}
		public void setSoCayTrong(int sct){
			soCayTrong= sct;
		}
		
		//Linh Chi
		public int getLinhChi(){
			return linhChi;
		}
		public void setLinhChi(int lc){
			linhChi= lc;
		}
		
		//Ha thu o
		public int getHaThuO(){
			return haThuO;
		}
		public void setHaThuO(int hto){
			haThuO= hto;
		}	
		
		//Nhan Sam
		public int getNhanSamO(){
			return nhanSam;
		}
		public void setNhanSam(int ns){
			nhanSam= ns;
		}	
		
		// Thattam lien
		public int getThatTamLien(){
			return thatTamLien;
		}
		public void setThatTamLien(int ttl){
			thatTamLien= ttl;
		}	
		
	// Bien i de set nghe nghiep 
		Scanner scanIn = new Scanner(System.in);
		
		public String  nhapNgheNghiep(){
			do{
				try{
					i=Integer.parseInt(scanIn.nextLine());
				}
				catch(Exception e){
					i=0;
				}
				if(i==1){
					ngheNghiep ="Trong thuoc";
				}
				else if(i==2){
					ngheNghiep = "Tim thuoc";
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
				setDiemCongHien(soCayTrong);
				setThuNhap(soCayTrong);
				thuong(getThuNhap());
			}
			else if(i==2){
				int dem = linhChi*5+haThuO*7+nhanSam*10+thatTamLien*20; 
				setDiemCongHien(dem);
				setThuNhap(dem);
				thuong(getThuNhap());
				
			}
		}
				
				
		public void nhap(){
			super.nhap();
			System.out.println("Nhap nghe nghiep chon 1 hoặc 2");
			System.out.println("1-Trong thuoc; 2- Hai thuoc: ");
			setNgheNghiep(nhapNgheNghiep());
			if(i==1){
				System.out.println("So cay thuoc trong duoc: ");
				setSoCayTrong(duLieu.nhapInt());
			}
			else if(i==2){
				System.out.println("So cay thuoc hai duoc: ");
				System.out.print("Linh chi: ");
				setLinhChi(duLieu.nhapInt());
				System.out.print("Ha thu o: ");
				setHaThuO(duLieu.nhapInt());
				System.out.print("Nhan Sam: ");
				setNhanSam(duLieu.nhapInt());
				System.out.print("That tam lien: ");
				setThatTamLien(duLieu.nhapInt());
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
