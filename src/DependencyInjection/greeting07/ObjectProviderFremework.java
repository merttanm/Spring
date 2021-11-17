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
public class ObjectProviderFremework {

    
    private GreetingProvider provider;
    private GreetingRenderer render;

    public ObjectProviderFremework() {
    }

    public Object objectFramework(String className1, String className2) {

        Object objRender = null;
        Object objProvider = null;
        try {
            objRender = Class.forName(className1).getDeclaredConstructor().newInstance();
            objProvider = Class.forName(className2).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (objRender instanceof GreetingRenderer) 
            render = (GreetingRenderer) objRender;
        
        if (objProvider instanceof GreetingProvider) 
            provider = (GreetingProvider) objProvider;
        
        render.setGreetingProvider(provider);
        return  render;

    }

}
