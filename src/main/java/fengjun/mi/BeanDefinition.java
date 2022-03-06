package fengjun.mi;

/**
 * 类的定义
 *
 * @author mifengjun@gmail.com
 * @version 1.0
 * @date 2022/3/6 12:39 下午
 */
public class BeanDefinition {

    private final Object beanClass;

    public BeanDefinition(Object object) {
        this.beanClass = object;
    }

    public Class<?> getBeanClass() {
        return (Class<?>) beanClass;
    }
}
