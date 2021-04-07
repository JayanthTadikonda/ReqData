import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
    private ApplicationContext context = null;


    public void Printing(){
        System.out.println("Hello Bean");
    }

    public void init(){
        System.out.println("User Defined Initialization!");
    }
    public void kill(){
        System.out.println("User Defined Bean Destruction!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Bean !!! ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name: " + name);
    }
}
