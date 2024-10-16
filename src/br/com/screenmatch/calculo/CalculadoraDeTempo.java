package br.com.screenmatch.calculo;

//import br.com.screenmatch.modelos.Filme;
//import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;


public class CalculadoraDeTempo {
    private int tempoTotal = 0;

	public int getTempoTotal() {
		return this.tempoTotal;
	}
	
    //Ao inves de usar desta forma abaixo repetindo os codigos
	
	//public void inclui(Filme f) {
	//	this.tempoTotal += f.getDuracaoEmMinutos();
	//}
	//
	//public void inclui(Serie s) {
	//	this.tempoTotal += s.getDuracaoEmMinutos();
	//}	
    //}
    
	//usar desta forma abaixo
	
	 public void inclui(Titulo titulo) {
		 System.out.println("Adicionando duração em minutos de " + titulo);
		 this.tempoTotal += titulo.getDuracaoEmMinutos();
	 }
}