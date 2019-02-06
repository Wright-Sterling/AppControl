/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;

import java.util.HashMap;

/**
 *
 * @author jswrigh
 */
public class ApplicationController {
    private static AppController myAppController = new AppController();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myAppController.mapCommand("String", new StringHandler());
        //Simulate another command
        myAppController.mapCommand("Object", new ObjectHandler());

        //Parameters for string command
        HashMap <String, Object> stringParams = new HashMap();
        stringParams.put("Key", "Value String as Object");

        //Parameters for object command
        HashMap <String, Object> beanParams = new HashMap();
        ExampleBean myBean = new ExampleBean();
        myBean.setId(1);
        myBean.setName("Porter Rockwell");
        myBean.setCalling("Problem Solver");
        //Add bean to hashmap
        beanParams.put("Display",myBean);
        
        //Now call the handlers
        System.out.println("-Handling String request");
        myAppController.handleRequest("String",stringParams);
        System.out.println("-Handling Object request");
        myAppController.handleRequest("Object",beanParams);
    }    
}
