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
public class StandartOutputRender {

    private HelloWordGreetingProvider helloWordMessage = null;

    public  void setGreatingProvider(HelloWordGreetingProvider provider) {
        this.helloWordMessage=provider;
    }
    
  

    public void render() {
        String greeting = helloWordMessage.message();
        System.out.println(greeting);
    }

}
