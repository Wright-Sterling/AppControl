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
        myAppController.mapCommand("Example", new ExampleHandler());
        HashMap <String, Object> exampleParams = new HashMap();
        exampleParams.put("Key", "Value String as Object");
        
        myAppController.handleRequest("Example",exampleParams);
    }
    
}
