/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InversionOfControl.domain;

/**
 *
 * @author merttan
 */
public class BeanA {

    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        if (beanB != null) {
            return "BeanA: " + beanB.toString();
        } else {
            return "BeanA: " + "beanB is null";
        }
    }

    public static BeanA create() {
        return new BeanA();
    }
}
