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
public class StandartOutputRenderer implements GreetingRenderer {

    GreetingProvider greetingProvider=null;


    public void render() {
        String greeting = greetingProvider.getGreeting();
        System.out.println(greeting);
    }

    @Override
    public void setGreetingProvider(GreetingProvider provider) {
        this.greetingProvider = provider;

    }

}
