/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting03;

/**
 *
 * @author merttan
 */
public class Application {
    public static void main(String[] args) {
      
        StandartOutputRender renderer= new StandartOutputRender();

        HelloWordGreetingProvider provider= new HelloWordGreetingProvider();
        
        renderer.setGreatingProvider(provider); 
        renderer.render();
    }
    
}
