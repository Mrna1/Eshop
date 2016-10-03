package cz.eshop.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Controller
@Component
public class ProductController {

    @RequestMapping(value = "/string", method = RequestMethod.POST)
    public String someString(){
        return "string";
    }
}
