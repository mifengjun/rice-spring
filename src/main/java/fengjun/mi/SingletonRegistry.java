package fengjun.mi;

/**
 * 单例 bean 获取接口
 *
 * @author mifengjun@gmail.com
 * @version 1.0
 * @date 2022/3/6 3:44 下午
 */
public interface SingletonRegistry {


    void registerSingleton(String beanName, Object singletonObject);

    Object getSingleton(String beanName);
}
