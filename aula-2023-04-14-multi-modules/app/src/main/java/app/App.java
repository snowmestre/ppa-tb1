package app;

import java.util.Optional;
import java.math.BigDecimal;
import java.time.LocalDate;

import memoria.persistence.AlunoRepository;
import memoria.persistence.BoletoRepository;
import memoria.persistence.CursoRepository;
import memoria.persistence.MatriculaRepository;
import memoria.persistence.ParametroRepository;
import modelo.entidade.Aluno;
import modelo.entidade.Curso;
import modelo.entidade.Boleto;
import modelo.service.MatriculaService;
import modelo.service.ServiceException;
import persistence.IAlunoRepository;
import persistence.IBoletoRepository;
import persistence.ICursoRepository;
import persistence.IMatriculaRepository;
import persistence.IParametroRepository;

public class App {
    
    public static void main(String[] args) {

        IAlunoRepository alunoRepository = new AlunoRepository();
        ICursoRepository cursoRepository = new CursoRepository();
        IParametroRepository paramRepository = new ParametroRepository();
        IBoletoRepository boletoRepository = new BoletoRepository();
        IMatriculaRepository matriculaRepository = new MatriculaRepository();
        

        MatriculaService matriculaService = new MatriculaService(
            alunoRepository, 
            cursoRepository,
            paramRepository,
            boletoRepository,
            matriculaRepository);
      //  Matricula m = matriculaService.matricular("12345678901", 123);
        Aluno aluno = new Aluno(Integer.valueOf(1), "12345678912", "Marcos", "marcos@gmail.com", LocalDate.of(1998, 10, 31));
        alunoRepository.insert(aluno);

        Curso curso = new Curso(Integer.valueOf(123), "PPA", "Varias paradas", Integer.valueOf(100),Integer.valueOf(40), Integer.valueOf(0), LocalDate.of(2023, 12, 15), 15);
        cursoRepository.save(curso);

        Boleto boleto = new Boleto(Integer.valueOf(1), BigDecimal.valueOf(100.0), LocalDate.of(2023, 12, 30), true, "12345678912");
        boletoRepository.insert(boleto);

        try {
            matriculaService.matricular("12345678912", 123);
        } catch (ServiceException se) {
            System.err.println(se); // CPF não existe
        }

        System.out.println("Matricula Realizada " + matriculaRepository.findAll());
        
        // Tecnico t = new Tecnico();
        // t.setCodigo(123L);
        // t.setNome("Geraldo dos Santos");
        // t.setAtivo(true);


        // Repository<Tecnico, Long> repo = new Repository<>(Tecnico.class);  

        // //repo.delete(123L);
        // //repo.save(t);

        // Optional<Tecnico> find = repo.findById(123L);

        // System.out.println(find);



         /* 
         * Chamado c = new Chamado();
         * c.setAutor("Marcio");
         * 
         * Repository<Chamado> repoChamado = new Repository<>();
         * repoChamado.save(c); // insert into chamado (autor, etc) values (?, ?)
         * 
         * 
         * TecnicoRepository tecnicoRepository =
         * new TecnicoRepository();
         * //tecnicoRepository.save(t);
         * 
         * tecnicoRepository.findAll()
         * .forEach(tec ->
         * System.out.println(tec.getNome()));
         */
    }

}
