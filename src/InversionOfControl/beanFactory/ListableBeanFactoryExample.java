/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionOfControl.beanFactory;

import java.util.Arrays;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author merttan
 */
public class ListableBeanFactoryExample {

    public static void main(String... args) {
        ListableBeanFactory beanFactory= getListableBeanFactory();
        
        int beanCount = beanFactory.getBeanDefinitionCount();
        System.out.println("beanCount: "+beanCount);
        
        String[] beanNames= beanFactory.getBeanDefinitionNames();
        System.out.println("-------- Bean Names --------");
        Arrays.stream(beanNames).forEach(System.out::println);
        
        

    }

    private static ListableBeanFactory getListableBeanFactory() {

        ListableBeanFactory factory = new ClassPathXmlApplicationContext( "InversionOfControl/beanFactory/resources/beans.xml");
        return factory;

    }

}
