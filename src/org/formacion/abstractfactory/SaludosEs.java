package org.formacion.abstractfactory;
import Interfaces.Saludos;

public class SaludosEs implements Saludos {

	@Override
	public String buenosDias() {
		return "buenos d�as";
	}

	@Override
	public String buenasTardes() {
		return "buenas tardes";
	}

}
