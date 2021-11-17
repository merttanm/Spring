/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionOfControl.beanFactory;

import InversionOfControl.domain.BeanA;
import InversionOfControl.domain.BeanB;
import InversionOfControl.domain.BeanC;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author merttan
 */
public class BeanFactoryExample {

    public static void main(String... args) {
        getBeanA();
        getOtherBeans();
    }

    private static BeanFactory getBeanFactory() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
                "InversionOfControl/beanFactory/resources/beans.xml");
        return beanFactory;
    }

    public static void getBeanA() {
        BeanFactory factory = getBeanFactory();

        BeanA beanA = (BeanA) factory.getBean("beanA");
        System.out.println("beanA : " + beanA);

        beanA = (BeanA) factory.getBean("bean_a");
        System.out.println("bean_a: " + beanA);

        beanA = (BeanA) factory.getBean("BEAN_A");
        System.out.println("BEAN_A: " + beanA);

        beanA = (BeanA) factory.getBean("BEAN-A");
        System.out.println("BEAN-A: " + beanA);

        beanA = (BeanA) factory.getBean("aa");
        System.out.println("aa    : " + beanA);

        beanA = (BeanA) factory.getBean("a");
        System.out.println("a     : " + beanA);

        // bütün beanleri bir diziye atıyor
        System.out.println();
        String[] aliases = factory.getAliases("beanA");

        for (String alias : aliases) {
            System.out.println(alias);
        }
        // container de bu bean varmı yok mu 
        System.out.println();
        boolean bool = factory.containsBean("aa");
        System.out.println(bool);

    }

    public static void getOtherBeans() {

        BeanFactory factory = getBeanFactory();

        BeanB beanB = (BeanB) factory.getBean("beanB");
        System.out.println("beanB: " + beanB);
        /*
        beanB = (BeanB) factory.getBean(BeanB.class);
        System.out.println("BeanB.class: " +beanB);
         */

        BeanC beanC = (BeanC) factory.getBean("beanC");
        System.out.println("beanC: " + beanC);
        beanC = (BeanC) factory.getBean(BeanC.class);
        System.out.println("beanC.class: " + beanC);
        
        ObjectProvider<BeanA> op = factory.getBeanProvider(BeanA.class);
        System.out.println(op);
        
    }

}
