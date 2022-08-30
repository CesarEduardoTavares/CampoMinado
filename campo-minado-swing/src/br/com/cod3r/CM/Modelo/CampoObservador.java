package br.com.cod3r.CM.Modelo;


@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu (Campo campo, CampoEvento evento);

}
