
public class GCF {
	
	public static int gcf(int x, int y){
		int gcf=0;
		for(int i=1;i<=x || i <= y; i++){
			if(x%i==0 && y%i==0){
				gcf = i;
			}
		}
		return gcf;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
