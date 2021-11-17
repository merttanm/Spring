/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting05;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author merttan
 */
public class GreetingFactory implements Factory {

    public static GreetingFactory instance;
    public Properties props;

    public GreetingRenderer renderer;
    public GreetingProvider provider;
    
    {
		props = new Properties();
		try {
			props.load(new FileInputStream("/Users/merttan/Desktop/Java/Spring/src/greeting05/resources/application.properties"));
			// Get the name of the implementation classes
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			// Create object instances of MessageRenderer and MessageProvider
			renderer = (GreetingRenderer) Class.forName(rendererClass).newInstance();
			provider = (GreetingProvider) Class.forName(providerClass).newInstance();
                } catch (Exception ex) {
			ex.printStackTrace();
		}
	}
    static {
        instance = new GreetingFactory();
    }

    public static GreetingFactory getInstance() {
        return instance;
    }

    @Override
    public GreetingRenderer getGreetingRenderer() {
        return renderer;
    }

    @Override
    public GreetingProvider getGreetingProvider() {
        return provider;
    }

}
