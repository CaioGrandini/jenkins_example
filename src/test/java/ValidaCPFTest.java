
import static org.junit.jupiter.api.Assertions.*;

import org.ValidaCPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidaCPFTest {

    @Test
    void testCPFValido() {
        ValidaCPF validaCpf = new ValidaCPF();
        Assertions.assertTrue(validaCpf.isCPF("12345678909"));
    }
    @Test
    void testCPFsInvalidos() {
        ValidaCPF validaCpf = new ValidaCPF();
        Assertions.assertFalse(validaCpf.isCPF("11111111111"));
        Assertions.assertFalse(validaCpf.isCPF("00000000000"));
    }
    @Test
    void testCPFComTamanhoIncorreto() {
        ValidaCPF validaCpf = new ValidaCPF();
        Assertions.assertFalse(validaCpf.isCPF("12345"));
        Assertions.assertFalse(validaCpf.isCPF("123456789012345"));
    }
    @Test
    void testCPFComCaracteresNaoNumericos() {
        ValidaCPF validaCpf = new ValidaCPF();
        Assertions.assertFalse(validaCpf.isCPF("A2345678909"));
    }
    @Test
    void testCPFNulo() {
        ValidaCPF validaCpf = new ValidaCPF();
        Assertions.assertFalse(validaCpf.isCPF(""));
    }
}
