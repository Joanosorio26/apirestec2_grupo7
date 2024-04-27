package pe.edu.cibertec.apirestec2_grupo7.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdDocente;
    private String NomDocente;
    private String ApeDocente;
    private Date FechNacDocente;
}
