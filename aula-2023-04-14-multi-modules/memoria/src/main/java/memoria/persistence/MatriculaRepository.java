package memoria.persistence;

import java.util.HashMap;
import java.util.Map;
import modelo.entidade.Matricula;
import persistence.IMatriculaRepository;

public class MatriculaRepository implements IMatriculaRepository {
  static Map<String, Matricula> matriculas = new HashMap<>();

  @Override
 
  @Override
  public void save(Matricula matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
  
}
