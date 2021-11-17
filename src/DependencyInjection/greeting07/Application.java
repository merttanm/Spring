/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting07;



/**
 *
 * @author merttan
 */
public class Application {
    

    public static void main(String[] args) {
        //  Bu yapı dependecy management framework'ü haline geliyor
        ObjectProviderFremework framework=new ObjectProviderFremework();
  

        GreetingRenderer renderer1 = (GreetingRenderer) framework.objectFramework("greeting07.StandartOutputRenderer", "greeting07.SelamGreetingProvider");
        renderer1.render();
        
        
       
        GreetingRenderer renderer2 = (GreetingRenderer) framework.objectFramework("greeting07.ErrorOutputRenderer","greeting06.HelloWordGreetingProvider");
        renderer2.render();

        
        
        
    }

}
