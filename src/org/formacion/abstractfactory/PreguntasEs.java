package org.formacion.abstractfactory;
import Interfaces.Preguntas;

public class PreguntasEs implements Preguntas {

	@Override
	public String preguntaHora() {
		return "�Qu� hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "�Qu� tiempo hace?";
	}

}
