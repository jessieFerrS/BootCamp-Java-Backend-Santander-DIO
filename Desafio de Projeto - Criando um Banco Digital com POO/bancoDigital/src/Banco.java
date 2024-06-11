import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Banco {

    private final String nome = "Santander";
    private List<Conta> contas;
    private List<Cliente> clientes;

}

