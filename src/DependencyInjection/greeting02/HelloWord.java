/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInjection.greeting02;

/**
 *
 * @author merttan
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(args.length>0){
            System.out.println(args[0]);
        }else{
            System.out.println("Hello Word");
        }
        
    }
    
}
