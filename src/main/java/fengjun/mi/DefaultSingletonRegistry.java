package fengjun.mi;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认单例对象注册表
 *
 * @author mifengjun@gmail.com
 * @version 1.0
 * @date 2022/3/6 4:01 下午
 */
public class DefaultSingletonRegistry implements SingletonRegistry {

    private final Map<String, Object> singletonObject = new HashMap<>(16);

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        this.singletonObject.put(beanName, singletonObject);
    }

    @Override
    public Object getSingleton(String beanName) {
        return this.singletonObject.get(beanName);
    }
}
