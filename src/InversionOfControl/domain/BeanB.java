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
public class BeanB {

    private BeanC beanC;

    public BeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Override
    public String toString() {
        if (beanC != null) {
            return "BeanB: " + beanC.toString();
        } else {
            return "BeanB: " + "beanC is null";
        }
    }

    public static BeanB create() {
        return new BeanB();
    }
}
