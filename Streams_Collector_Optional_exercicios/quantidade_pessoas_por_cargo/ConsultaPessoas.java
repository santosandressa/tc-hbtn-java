import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

     public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getCargo() != null)
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }
}
