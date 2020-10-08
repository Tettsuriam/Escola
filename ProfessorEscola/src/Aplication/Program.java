package Aplication;

import java.util.Scanner;

import Entitis.Estudante;
import Entitis.GeraMedia;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.print("\nEntre com o as notas: \n");
		Double [][] trim = new Double [3][2];
		Estudante aluno = new Estudante(nome);
		GeraMedia mediaG = new GeraMedia();
		for (int i = 0; i< 3; i++) {
			
			for(int j =0 ; j<2; j++) {
				System.out.print("\nEntre com a nota #"+(j+1)+" do "+(i+1)+"° trimestre: ");
				trim[i][j]=sc.nextDouble();
				aluno.addNota(trim[i][j]);	
			}
			aluno.addMedia(mediaG.CMediaT(trim[i][0], trim[i][1]));
			
		}
		aluno.setMFinal(mediaG.MediaFinal(aluno.getMedias()));
		
		System.out.println(aluno);
		
		sc.close();
	}

}
