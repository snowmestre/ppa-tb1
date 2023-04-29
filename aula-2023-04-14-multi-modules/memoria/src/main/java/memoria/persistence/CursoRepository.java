package memoria.persistence;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import modelo.entidade.Curso;
import persistence.ICursoRepository;

public class CursoRepository implements ICursoRepository {
  static Map<String, Curso> cursos = new HashMap<>();

  @Override
  public Optional<Curso> findByCodigo(Integer codigoCurso) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByCodigo'");
  }

  @Override
  public void update(Curso curso) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }
  
}
