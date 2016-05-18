import java.util.Scanner;
public class TinhLinh extends ThanhVien {
	private String ngheNghiep;
	//Nghe Nghiep
		public String getNgheNghiep(){
			return ngheNghiep;
		}
		public void setNgheNghiep(String nn){
			ngheNghiep = nn;
		}
	// Bien i de set nghe nghiep 
		Scanner scanIn = new Scanner(System.in);
		int i;
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
}
