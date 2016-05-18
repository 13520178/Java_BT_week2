import java.util.Scanner;
public class DuLieu {
	Scanner scanIn = new Scanner(System.in);
	//Kiem tra du lieu kieu nguyen
	public int nhapInt(){
		int i;
		do{
			try{
				i= Integer.parseInt(scanIn.nextLine());
			}
			catch(Exception e){
				i =0;
			}
			if(i==0){
				System.out.println("***NHAP SAI***");
				System.out.print("Nhap lai: ");
			}
		}while(i==0);
		
		return i;
	}
	
	//Kiem tra kieu du lieu String
	public String nhapString(){
		String i;
		do{
		
			i= scanIn.nextLine();
			if(i==""){
				System.out.println("***NHAP SAI***");
				System.out.print("Nhap lai: ");
			}
			
		}while(i=="");
		
		return i;
	}
	
	
}
