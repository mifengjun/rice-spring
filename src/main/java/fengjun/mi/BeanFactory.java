package fengjun.mi;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO 描述此类作用
 *
 * @author mifengjun@gmail.com
 * @version 1.0
 * @date 2022/3/6 12:50 下午
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>(16);

    public void registerBean(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }
}
