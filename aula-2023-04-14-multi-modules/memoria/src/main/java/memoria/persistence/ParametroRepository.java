package memoria.persistence;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

import persistence.IParametroRepository;

public class ParametroRepository implements IParametroRepository {
  static Map<string, Parametro> parametros = new HashMap<>();

  @Override


  @Override
  public Optional<String> findParam(String nome) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findParam'");
  }
  
}
