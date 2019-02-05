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
public class ExampleHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        System.out.println(dataMap);
    }
}
