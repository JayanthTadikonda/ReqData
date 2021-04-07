import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) context.getBean("demo");
        beanLifeCycleDemo.Printing();


    }
}
