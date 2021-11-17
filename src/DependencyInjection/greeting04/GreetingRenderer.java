/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting04;

/**
 *
 * @author merttan
 */
public interface GreetingRenderer {
    
    void render();
    void setGreetingProvider(GreetingProvider greetingProvider);
    
}
