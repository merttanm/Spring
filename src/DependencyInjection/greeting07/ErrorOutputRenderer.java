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
public class ErrorOutputRenderer implements GreetingRenderer {

    GreetingProvider provider = null;

    @Override
    public void render() {
        try {
            System.err.println(provider.getGreeting());
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    @Override
    public void setGreetingProvider(GreetingProvider greetingProvider) {
        this.provider = greetingProvider;
    }

}
