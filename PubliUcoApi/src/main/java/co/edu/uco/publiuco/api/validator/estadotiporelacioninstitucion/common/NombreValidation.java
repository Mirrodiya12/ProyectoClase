package co.edu.uco.publiuco.api.validator.estadotiporelacioninstitucion.common;

import java.util.UUID;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class NombreValidation implements Validation<String>{

	private NombreValidation() {
		super();
	}
	
	public static final Result validate(final String data) {
		return new NombreValidation().execute(data);
	}
	
	
	
	@Override
	public final Result execute(String data) {
		var result = Result.create();
		
		if(UtilText.getUtilText().isEmpty(data)) {
			result.addMessage("No es posible continuar con el nombre del estado del tipo relacion institucion vacio");
			
		}
		
		else { //validar la longitud de la cadena
			if(true) {
				result.addMessage("El nombre del estado del tipo relacion institucion no debe ser menor a 1 o mayor a 30 caracteres");
			}
			if(true) {//validar formato solo letras
				result.addMessage("El nombre del estado del tipo relacion institucion solo puede contener letras y espacios");
		}
		
	}
		return result;
		
	}}


