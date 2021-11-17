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
public class StandartOutputRender implements GreetingRenderer{

    private GreetingProvider greetingProvider = null;

  
    @Override
    public void render() {
        String greeting = greetingProvider.getGreeting();
        System.out.println(greeting);
    }

    @Override
    public void setGreetingProvider(GreetingProvider greetingProvider) {
        this.greetingProvider=greetingProvider;
    }

}
