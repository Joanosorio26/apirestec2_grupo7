package pe.edu.cibertec.apirestec2_grupo7.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apirestec2_grupo7.model.bd.Docente;
import pe.edu.cibertec.apirestec2_grupo7.service.IDocenteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/docente")
public class DocenteController {
    private IDocenteService iDocenteService;
    @GetMapping("")
    @ResponseBody
public List<Docente> ListarDocente(){
    return
    iDocenteService.ListarDocente();
}

}
