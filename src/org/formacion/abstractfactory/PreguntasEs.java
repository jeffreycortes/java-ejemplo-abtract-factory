package org.formacion.abstractfactory;
import Interfaces.Preguntas;

public class PreguntasEs implements Preguntas {

	@Override
	public String preguntaHora() {
		return "¿Qué hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "¿Qué tiempo hace?";
	}

}
