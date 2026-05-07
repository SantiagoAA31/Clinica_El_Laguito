	package co.edu.uptc.clinica.enums;

/**
 * Nombre de la clase: TypeDocID
 *
 * <p>[Enumuerador encargado de denotar los distintos tipos del documento de identidad]</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>[Responsabilidad 1]</li>
 *   <li>[Responsabilidad 2]</li>
 * </ul>
 *
 * <p><b>Notas:</b></p>
 * <ul>
 *   <li>[Consideraciones importantes]</li>
 * </ul>
 *
 * @author david
 * @version 1.0
 * @since 6/05/2026
 */
	
public enum TypeDocID {
	

	
	
	
	CC("Cédula de ciudadanía"),
	TI("Tarjeta de identidad"),
	CE("Cédula de extranjería"),
	PA("Pasaporte");
	
	// Se crea un atributo para guardar el "nombre oficial" de cada tipo de documento
	
	private String officialName;

	// Se crea metodo constructor para usar las constantes de arriba con su 
	// parte en string
	
	TypeDocID(String officialName) {
		this.officialName = officialName;
	    }
	
	// Se crea getter para llamar al nombre oficial cuando se requiera
	public String getOfficialName() {
	    return officialName;
	    }
}