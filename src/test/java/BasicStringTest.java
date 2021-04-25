import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Epic("Basic string Tests Epic")
@Feature("basic String operations")
public class BasicStringTest {


    @Test
    @DisplayName("Concatanation test")
    @Story("User is doing concatanate string.")
    @Description("This is the test of concatanation of 'abc' & 'def'.")
    public void concatanateTest () {
        Assertions.assertTrue (BasicString.concatanate("abc","def").compareTo("abcdef") == 0 );
    }

    @Test
    @DisplayName("case sensitive concatanation test")
    @Story("User is doing concatanate string. Result is not in uppercase")
    @Description("This is the case sensitive test of concatanation of 'abc' & 'def'.")
    public void concatanateFailTest () {
        Assertions.assertTrue(BasicString.concatanate("abc","def").compareTo("ABCDEF") == 0 );
    }
}
