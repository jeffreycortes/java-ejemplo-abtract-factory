package org.formacion.abstractfactory;
import Interfaces.Preguntas;

public class PreguntasEn implements Preguntas {

	@Override
	public String preguntaHora() {
		return "what time is it?";
	}

	@Override
	public String preguntaTiempo() {
		return "how is the weather?";
	}

	
}
