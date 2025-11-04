package com.nethmal.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Div {


 // @Autowired //field injection
 private laptop laptop;

 //.......................................

  //constructor injection
//public Div(laptop laptop) {
//    this.laptop = laptop;
//
//}

//.......................................

@Autowired//setter injection
public void setLaptop(laptop laptop) {
    this.laptop = laptop;
}


    public void greet() {
        laptop.compile();


        System.out.println("Nethmal Demo App!");
    }

}
