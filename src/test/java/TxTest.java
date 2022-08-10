import com.day06.Service.IAccountService;
import com.day06.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TxTest {
    @Autowired
    private IAccountService accountService;
    @Test
    public void tranferTest()
    {
        accountService.transfer(1,2,100d);
    }

}
