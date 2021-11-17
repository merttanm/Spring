/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting06;

/**
 *
 * @author merttan
 */
public class Application {
    // 22:50 dakika

    public static void main(String[] args) {
        
        ObjectProviderFremework framework=new ObjectProviderFremework();
  

        GreetingRenderer renderer1 = (GreetingRenderer) framework.objectFramework("greeting06.StandartOutputRenderer");
        GreetingProvider provider1 = (GreetingProvider) framework.objectFramework("greeting06.SelamGreetingProvider");
        
        renderer1.setGreetingProvider(provider1);
        renderer1.render();
        
        
        
        GreetingRenderer renderer2 = (GreetingRenderer) framework.objectFramework("greeting06.ErrorOutputRenderer");
        GreetingProvider provider2 = (GreetingProvider) framework.objectFramework("greeting06.HelloWordGreetingProvider");
        
        renderer2.setGreetingProvider(provider2);
        renderer2.render();

        
        
        
    }

}
