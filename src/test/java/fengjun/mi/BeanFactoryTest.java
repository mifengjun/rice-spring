package fengjun.mi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeanFactoryTest {

    static BeanFactory beanFactory = new BeanFactory();

    @Test
    void registerBean() {
        beanFactory.registerBean("UserService", new BeanDefinition(new UserService()));
    }

    @Test
    void getBean() {
        Assertions.assertEquals(((UserService)beanFactory.getBean("UserService")).getUserName(),"meimei.han");
    }
}