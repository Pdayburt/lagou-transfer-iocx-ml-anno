import com.lagou.edu.service.TransferService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void testIOC(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object accountDao = classPathXmlApplicationContext.getBean("accountDao");
//        System.out.println(accountDao);
//        Object accountDao1 = classPathXmlApplicationContext.getBean("accountDao");
//        System.out.println(accountDao1);
//        Object bean = classPathXmlApplicationContext.getBean("connectionUtils");
//        System.out.println(bean);
//        classPathXmlApplicationContext.close();
        Object bean = classPathXmlApplicationContext.getBean("&companyBean");
        System.out.println(bean);
        classPathXmlApplicationContext.close();
    }

    @Test
    public void testIOC1() throws Exception {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransferService transferService = classPathXmlApplicationContext.getBean(TransferService.class);
        transferService.transfer("6029621011000","6029621011001",1000);
    }


}
