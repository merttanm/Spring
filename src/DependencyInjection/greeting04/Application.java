/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting04;

//import greeting03.*;
/**
 *
 * @author merttan
 */
public class Application {

    public static void main(String[] args) {

        StandartOutputRender creatingMessage = new StandartOutputRender();

        HelloWordGreetingProvider providerMessage1 = new HelloWordGreetingProvider();
        creatingMessage.setGreetingProvider(providerMessage1);
        creatingMessage.render();

        SelamGreetingProvider providerMessage2 = new SelamGreetingProvider();
        creatingMessage.setGreetingProvider(providerMessage2);
        creatingMessage.render();
    }

}
