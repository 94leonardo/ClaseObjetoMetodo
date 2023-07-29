package gestioncasa;

class Casa {

	String nombrePropietario;
	int superficie;

	void establecerPropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	String devolverPropietario() {
		return nombrePropietario;
	}

	void visualizarPropietario() {
		System.out.println("el propietario es : " + nombrePropietario);

	}

	void establecerSuperficie(int superficie) {
		this.superficie = superficie;
	}

	int devolverSuperficie() {
		return superficie;
	}

	void visualizarSuperficie() {
		System.out.print("la superficie es : " + superficie);
	}

}
