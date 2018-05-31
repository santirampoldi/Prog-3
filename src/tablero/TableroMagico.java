package tablero;


public class TableroMagico {
	int cuadrado[][];
	boolean usado[];
	final int n;		//Cantidad de filas y columnas de la matriz
	final int s;		//Valor objetivo al sumar toda una fila o columna
	final int k;		//Valor maximo que puede tomar cada posicion en la matriz
	boolean solucion;	//Condicion de corte para mostrar una sola solucion y no todas las posibles
	//int total = 0;	//Contador para saber el total de soluciones posibles

	public TableroMagico(int n, int k, int s) {
		cuadrado = new int[n][n];
		this.n = n;
		this.s = s;
		this.k = k;
		solucion = false;
		usado = new boolean[k+1];
	}

	private boolean solucionFinal() {		//Chequea al final de una posible solucion si cumple con los requisitos
		for (int f = 0; f < n; f++) {
			int sum = 0;
			for (int c = 0; c < n; c++) { 
				sum += cuadrado[f][c]; 
			}
			if (sum != s) {
				return false;
			} 
		}

		for (int c = 0; c < n; c++) {
			int sum = 0;
			for (int f = 0; f < n; f++) { 
				sum += cuadrado[f][c]; 
			}
			if (sum != s) {
				return false;
			}  
		}

		return true;
	}

	private boolean esValido(int j, int val) {		//Chequea si un valor puesto en una posicion determinada
		int sumD1 = val;							//no se pasa del valor objetivo (Poda)
		int sumD2 = val;
		for (int i = 0; i < n; i++) {
			sumD1 += cuadrado[j/n][i];
			sumD2 += cuadrado[i][j%n];
		}

		return (sumD1 <= s  && sumD2 <= s );
	}

	public void resolver(int paso) {
		if (!solucion) {
			if (paso == (n*n)) {
				if (solucionFinal()) {
					System.out.println("Esta es la primer solucion encontrada: ");
					this.solucion = true;
					//total++; 
					imprimirMatriz();
				}
			}
			else {
				int i = paso;
				while (i < n*n) {
					for (int val = 1; val <= k; val++) {
						if (!usado[val] && esValido(i, val)) {
							usado[val] = true;
							cuadrado[i/n][i%n] = val;
							resolver(i+1);
							cuadrado[i/n][i%n] = 0;
							usado[val] = false;
						}
					}
					i++;
				}
			}
		} 
	}

	public void imprimirMatriz() {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.print(cuadrado[r][c]);
				System.out.print(' ');
			}
			System.out.println();
		}
		System.out.println();
	}
}