package es.uah.cursos.controller;

import es.uah.cursos.model.Curso;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct; 
import java.util.ArrayList;
import java.util.List;

@RestController
public class CursosController{
	
	private List<Curso> cursos;
	
	@PostConstruct
	public void init() {
		cursos = new ArrayList<>();
		cursos.add(new Curso("Spring", 50, "Profesor 1", 50));
		cursos.add(new Curso("Spring Boot", 30, "Profesor 2", 25));
		cursos.add(new Curso("Python", 30, "Profesor 3", 20.99));
		cursos.add(new Curso("Java EE", 60, "Profesor 4",60));
		cursos.add(new Curso("Java básico", 30, "Profesor 5",15.5));
	}
	
	@GetMapping("/cursos")
	public List<Curso> getCursos(){
		return cursos;
	}
	
	@GetMapping("/cursos/{name}")
	public List<Curso> buscarCursos(@PathVariable("name") String nombre){
		List <Curso> aux = new ArrayList<>();
		for (Curso c: cursos) {
			if(c.getNombre().contains(nombre)) {
				aux.add(c);
			}
		}
		return aux;
	}
	
	@DeleteMapping("/cursos/{name}")
	public void eliminarCurso(@PathVariable("name") String nombre) {
		//Elimina de la colección los elementos
		//que cumplan la condición
		cursos.removeIf(c -> c.getNombre().equals(nombre));
	}
	
	@PostMapping("/curso")
	public List<Curso> altaCurso(@RequestBody Curso curso){
		cursos.add(curso);
		return cursos;
	}
	
	@PutMapping("/curso")
	public List<Curso> actualizaCurso(@RequestBody Curso curso){
		//Recorre los cursos y sustituye aque que
		//coincida con el nombre
		for(int i=0;i<cursos.size();i++) {
			if(cursos.get(i).getNombre().equals(curso.getNombre())) {
				cursos.set(i, curso);
			}
		}
		return cursos;
	}
}