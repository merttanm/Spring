/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting05;

/**
 *
 * @author merttan
 */
public class Application {
    // 22:50 dakika

    public static void main(String[] args) {

        Factory factory=GreetingFactory.getInstance();

        GreetingRenderer renderer = factory.getGreetingRenderer();
        GreetingProvider provider = factory.getGreetingProvider();
        renderer.setGreetingProvider(provider);
        renderer.render();
        

        
        
        
    }

}
