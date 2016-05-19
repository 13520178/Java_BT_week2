import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class ThucThi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanIn= new Scanner(System.in);
		int i; //Bien chon chon toc
		List<ThanhVien> ThanhList = new ArrayList<ThanhVien>(); 
		do{
			System.out.println("Nhap chung toc: ");
			System.out.print("1- Tinh Linh; 2- Dia Tinh; 3- Nguoi; 0-ket thuc :");
			try{
				i= Integer.parseInt(scanIn.nextLine());
				
				if(i==1){
					TinhLinh a=new TinhLinh();
					a.nhap();
					ThanhList.add(a);
					
				}
				else if(i==2){
					DiaTinh a=new DiaTinh();
					a.nhap();
					ThanhList.add(a);
				}
				else if(i==3){
					Nguoi a=new Nguoi();
					a.nhap();
					ThanhList.add(a);
				}
				else if(i==0){
					i=0;
				}
				else{
					i=4;
				}
				
			}catch(Exception e){
				i=4;
			}
			if(i==4){
				System.out.println("***NHAP SAI***");
				System.out.println("Nhap lai:");
			}
		}while(i!=0);
		Collections.sort(ThanhList,new ThanhVienComparator());
		for(ThanhVien a : ThanhList){
			a.xuat();
		}
	}
}
