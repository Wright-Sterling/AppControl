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
public class ObjectHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        ExampleBean temp = (ExampleBean) dataMap.get("Display");
        System.out.println(temp.getId());
        System.out.println(temp.getName());
        System.out.println(temp.getCalling());
    }
}
