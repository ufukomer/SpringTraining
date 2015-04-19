package methodinjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ufuk on 19-04-15.
 */
public class MethodInjectionTest {
    @Test
    public void method_injection_test() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("springmethodinjectionconf.xml");
        TicketVendingMachine ticketVendingMachine =
                applicationContext.getBean("ticketVendingMachine", TicketVendingMachine.class);
        Ticket ticket = ticketVendingMachine.generateTicket();
        System.out.println("The ticket successfully generated by ticket vending machine = " + ticket);
    }
}