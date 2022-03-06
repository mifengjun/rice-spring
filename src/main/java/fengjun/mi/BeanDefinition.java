package fengjun.mi;

/**
 * 类的定义
 *
 * @author mifengjun@gmail.com
 * @version 1.0
 * @date 2022/3/6 12:39 下午
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object object) {
        this.bean = object;
    }

    public Object getBean() {
        return bean;
    }
}
