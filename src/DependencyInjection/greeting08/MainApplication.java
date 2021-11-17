/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting08;

/**
 *
 * @author merttan
 */
import org.springframework.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("DependencyInjection/greeting08/resources/beans.xml");

        // Render veya provider da etsem mesajı alıyor
        GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer"); // output HelloWord
        renderer.render();

        
        GreetingProvider provider = (GreetingProvider) factory.getBean("provider"); // output HelloWord 
        System.out.println(provider.getGreeting());

        // provider2 nin dosya yolu class="DependencyInjection.greeting08.SelamGreetingProvider"
        GreetingProvider provider2 = (GreetingProvider) factory.getBean("provider2"); // output Selam 
        System.out.println(provider2.getGreeting());

    }

}
