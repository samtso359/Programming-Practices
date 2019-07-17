
public class MatrixOps {
		
	public static double[][] multiply(double[][] A, double[][] B){
		int Acol=A[0].length;
		int Arows=A.length;
		int Bcol=B[0].length;
		int Brows=B.length;
		double[][] C = new double [A.length][B[0].length];
		int Ccol=C[0].length;
		int Crows= C.length;
		if(A[0].length != B.length){
		return null;
		}
		else{
			for(int i =0; i<Arows;i++){
				for(int j=0; j<Bcol;j++){
					for(int k = 0; k<Acol;k++){
						C[i][j] += A[i][k]*B[k][j];
					}
				}
			}
			
			return C;
				}
				}
}

