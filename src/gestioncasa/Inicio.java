package gestioncasa;

public class Inicio {

	public static void main(String[] args) {
		// DECLARAR REFERENCIAS

		Casa casa1, casa2;
		// INSTANCIAR OBJETOS
		casa1 = new Casa();
		casa2 = new Casa();

		// ASIGNAR VALORES A LOS ATRIBUTOS

		casa1.nombrePropietario = "ALICIA MARTIN";
		casa1.superficie = 110;
		String nombrePersona = "LUIS GARCIA"; 
		casa2.establecerPropietario(nombrePersona);
		int superficieInmueble = 95;
		casa2.establecerSuperficie(superficieInmueble);
		// VISUALIZAR VALORES DE LOS ATRIBUTOS

		System.out.println("CASA 1 : ");
		System.out.println("propietario : " + casa1.nombrePropietario);
		System.out.println("superficie : " + casa1.superficie);
		System.out.println("CASA 2 :");
		String nombreDesencapsulado = casa2.devolverPropietario();
		System.out.println("propietario : " + nombreDesencapsulado);
		int superficieDesencapsulada = casa2.devolverSuperficie();
		System.out.println("superficie : " + superficieDesencapsulada);
		casa2.visualizarPropietario();
		casa2.visualizarSuperficie();

	}

}
