var tam = 3;
var i, j;

var matriza = new Array(tam);
var matrizb = new Array(tam);
var matrizr= new Array(tam);

for (i = 0; i < tam; i++){
		matriza[i] = new Array(tam);
		matrizb[i] = new Array(tam);
		matrizr[i] = new Array(tam);
	
		for (j = 0; j < tam; j++){
				matriza[i][j]= Math.round(Math.random()*20) +1;
				matrizb[i][j]= Math.round(Math.random()*20) + 1;
				matrizr[i][j]= matriza[i][j]*matrizb[i][j];
		}
}

alert("El resultado es: " + matrizr);