/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionOfControl.greeting08;

/**
 *
 * @author merttan
 */
import org.springframework.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("InversionOfControl/greeting08/resources/beans.xml");
        // Render veya provider da etsem mesajı alıyor
        GreetingRenderer renderer = (GreetingRenderer) context.getBean("renderer"); // output HelloWord
        renderer.render();

        
        GreetingProvider provider = (GreetingProvider) context.getBean("provider"); // output HelloWord 
        System.out.println(provider.getGreeting());

        GreetingProvider provider2 = (GreetingProvider) context.getBean("provider2"); // output Selam 
        System.out.println(provider2.getGreeting());

    }

}
