import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras; //SOLICITA QUE O MOCKITO MOCK UMA LISTA


    @Test
    void adicionarItemNaLista(){
        Mockito.when((letras).getFirst()).thenReturn("B");

        Assertions.assertEquals("B", letras.getFirst());

    }
}
