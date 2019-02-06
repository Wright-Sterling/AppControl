package applicationcontroller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author jswrigh
 */
public class ExampleBean implements Serializable {
    
// Simple example
    private int id;  
    private String name;
    private String calling;

    public ExampleBean(){}  
    public void setId(int id){
        this.id=id;
    }  

    public int getId(){
        return id;
    }  

    public void setName(String name){
        this.name=name;
    }  

    public String getName(){
        return name;
    }  

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }
}
