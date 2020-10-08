package Entitis;

import java.util.List;

public class GeraMedia {
	
	
	public Double CMediaT(Double nota1, Double nota2) {
		Double res = (nota1+nota2)/2;
		return res;
	}
public Double MediaFinal ( List<Double> medias) {
	
	Double vet[] = medias.toArray(new Double[0]);
	Double som =0.0;
	for(int i =0;i<3;i++) {

		som+=vet[i];
		
	}
	

	return som/3;
	
}
	
}

