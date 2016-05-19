import java.util.Comparator;

public class ThanhVienComparator implements Comparator<ThanhVien>{
	public int compare(ThanhVien o1, ThanhVien o2) {
		  int thuNhap1 = o1.getThuNhap();
		  int thuNhap2 = o2.getThuNhap();
		  if(thuNhap2>thuNhap1){
		   return 1;
		  }else if(thuNhap1==thuNhap2){
		   return 0;
		  }else{
		   return -1;
		  }
		 }
}
