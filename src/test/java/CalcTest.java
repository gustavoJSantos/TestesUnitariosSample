import junit.framework.Assert;
import org.junit.Test;

public class CalcTest {

    Controller controller =  new Controller();

    @Test
    public void SomaTest(){
        controller.realizarConta('+', 10, 10);
        //Assert.assertEquals(controller.getRetorno(), "A soma é 20.0");
    }

    @Test
    public void SubtracaoTest(){
        controller.realizarConta('-', 10, 10);
        //Assert.assertEquals(controller.getRetorno(), "A subtracao é 0.0");
    }

    @Test
    public void MultiplicacaoTest(){
        controller.realizarConta('*', 10, 10);
        //Assert.assertEquals(controller.getRetorno(), "A multiplicação é 100.0");
    }

    @Test
    public void DivisaoTest(){
        controller.realizarConta('/', 10, 10);
       // Assert.assertEquals(controller.getRetorno(), "A divisão é 1.0");
    }

    @Test
    public void CaractereErradoTest(){
        controller.realizarConta('f', 10, 10);
        Assert.assertEquals(controller.getRetorno(), "Caractere inválido");
    }
}

