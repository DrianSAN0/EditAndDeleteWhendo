package testSuite.whenDo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;


public class BaseWhenDo {
    @BeforeEach
    public void before() {}

    @AfterEach
    public void after() {
        Session.getInstance().closeApp();
    }

}
