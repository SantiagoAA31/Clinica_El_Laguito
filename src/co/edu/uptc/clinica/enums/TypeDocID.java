package co.edu.uptc.clinica.enums;

public enum TypeDocID {
	
	// Se crean las constantes del enumerador y entre los parentesis -
	//el "nombre oficial" de cada tipo de documento
	
	
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