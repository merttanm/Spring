/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionOfControl.greeting08;

import DependencyInjection.greeting08.*;


/**
 *
 * @author merttan
 */
public class SelamGreetingProvider implements GreetingProvider {


    public String getGreeting() {
        return "Selam ";
    }

}
