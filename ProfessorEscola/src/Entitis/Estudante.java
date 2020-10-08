package Entitis;

import java.util.ArrayList;
import java.util.List;

import Entitis.Enum.categoria;


public class Estudante {
	private GeraMedia mediaG = new GeraMedia();
	private String name;
	private List<Double> NBase = new ArrayList <>();
	private List<Double> Medias = new ArrayList <>();
	private Double MFinal;
	
	
	public Estudante(String name) {

		this.name = name;
	}

	public Estudante(Double mFinal) {
		
		MFinal = mFinal;
	}
	
	@Override
	public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append("\n\nAluno: "+name+"\nMedias Trimestrais: \n");
	 int i =0;
	 	for(Double mds : Medias) {
	 		i++;
	 		sb.append(String.format("\nMedia #%d : %.2f ", i , mds));
	 	}
	 sb.append(String.format("\n\nMedia Final: %.2f",MFinal));
	 sb.append(String.format("\nSituação do aluno: %s",Seletor()));
	 return sb.toString();
	}

	public void addNota(Double nota) {
		NBase.add(nota);
	}
	
	public void removeNota(Double nota) {
		NBase.remove(nota);
	}
	
	public void addMedia(Double media) {
		Medias.add(media);

	}
	
	public List<Double> getMedias() {
		return Medias;
	}

	public void setMedias(List<Double> medias) {
		Medias = medias;
	}

	public categoria Seletor() {
		if(MFinal >=6) {
			return categoria.Pass;
		}else
			return categoria.Failed;
	}
	
	public void RemoveMedia(Double media) {
		Medias.remove(media);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMFinal() {
		return MFinal;
	}

	public void setMFinal(Double mFinal) {
		MFinal = mFinal;
	}
	
	
	
	

}
