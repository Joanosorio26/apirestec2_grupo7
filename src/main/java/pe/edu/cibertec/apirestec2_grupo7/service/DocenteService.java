package pe.edu.cibertec.apirestec2_grupo7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestec2_grupo7.model.bd.Docente;
import pe.edu.cibertec.apirestec2_grupo7.repository.DocenteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DocenteService implements IDocenteService {
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> ListarDocente() {
        return docenteRepository.findAll();
    }
}
