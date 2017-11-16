package cn.lovepi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Spring提供了管理Bean的两种不同类型的容器。Spring ApplicationContext 容器和Spring BeanFactory 容器
         * ApplicationContext 的主要实现类：ClassPathXmlApplicationContext、FileSystemXmlApplicationContext、WebApplicationContext
         * Spring支持三种格式的配置元数据：基于Java,基于注解（annotation）,基于XML
         *
         * 以下使用ClassPathXmlApplicationContext 容器和基于XML配置元数据。
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");


        /*
         * 从 IOC 容器中获取 bean 的实例
         * 利用id返回IOC容器中的Bean
         * 利用类型返回IOC容器中的Bean，但是要求IOC容器中只能有一个该类型的Bean。
         */
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld1");
        System.out.println(helloWorld1.getUserNme());

        Car car1=(Car)context.getBean("car1");
        System.out.println(car1);

        Car car2=(Car)context.getBean("car2");
        System.out.println(car2);
    }
}
