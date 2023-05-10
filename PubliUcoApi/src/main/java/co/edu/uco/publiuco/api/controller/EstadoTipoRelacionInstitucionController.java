package co.edu.uco.publiuco.api.controller;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadotiporelacioninstitucion")
public final class EstadoTipoRelacionInstitucionController {
	
	@GetMapping("/dummy")
	public EstadoTipoRelacionInstitucionDTO test() {
		return new EstadoTipoRelacionInstitucionDTO();
	}
	@GetMapping
	public List<EstadoTipoRelacionInstitucionDTO> list(@RequestParam EstadoTipoRelacionInstitucionDTO dto){
		
		List<EstadoTipoRelacionInstitucionDTO> list = new ArrayList<>();
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		
		return list;
	}
	
	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO listByID(@PathVariable UUID id){
		
		
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(id);
	}
	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO create(@PathVariable EstadoTipoRelacionInstitucionDTO dto) {
		
		return dto;
	}
	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO update(@PathVariable UUID id, @RequestParam EstadoTipoRelacionInstitucionDTO dto) {
		
		return dto.setIdentificador(id);
	}
	
	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO update(@PathVariable UUID id) {
		
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(id);
	}
	
	
	

}
