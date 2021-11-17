/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting06;

/**
 *
 * @author merttan
 */
public class ObjectProviderFremework {

    public Object objectFramework(String className) {

        Object o = null;
        try {
            o=Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            System.out.println(className);
        }catch (IllegalAccessException e) {
            System.out.println(className);
        }
        catch (ClassNotFoundException e) {
            System.out.println(className);
        }
        return o;

    }

}
