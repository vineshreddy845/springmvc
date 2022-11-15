package com.example.springmvc.controller;

import com.example.springmvc.pojo.Apimodel;
import com.example.springmvc.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {


    @Autowired
    private ApiService apiservice;
    @Value("world")
    private String message;

    @RequestMapping("/add")
    public List<Integer> Addition1(@RequestBody Apimodel apimodel) //model
    {
        return apiservice.Addition(apimodel); //view
    }

    @RequestMapping("/sub")
    public String Subtraction(@RequestBody Apimodel apimodel) {

        return apiservice.sub2(apimodel);
    }

    @RequestMapping("/html")
    public ModelAndView view() {

        ModelAndView view1 = new ModelAndView();
        view1.setViewName("See");
        view1.addObject("name", "name");
        return view1;
    }

    @RequestMapping("/map")
    public Apimodel apimodel(){ // how it looks like Apimodel apimodel = new Apimodel();
        return new Apimodel(1,2,"jai","india");
    }

    @RequestMapping("/map2")
    public Apimodel apimodel1(){ // here logic is written in apiservice. above method and these methods works same.
        return  apiservice.apimodels();
    }

    @RequestMapping("/listmap")
    public List<Apimodel> apimodel2()
    {
        List<Apimodel> model = new ArrayList<>();
        model.add(new Apimodel(1,2,"music","beats") );
        return model;
    }
    @RequestMapping("/listmap2")//here logic is written in apiservice. above method and these methods works same.
    public List<Apimodel> model1()
    {

        return apiservice.apimodel4();
    }


    //http://localhost:8080/pathvariable/1/2/gems/gender
    @GetMapping("/pathvariable/{number}/{number1}/{names}/{lastname}")
    public Apimodel pathvaibale(@PathVariable("number") int num1,@PathVariable("number1") int num2, @PathVariable("names") String name, @PathVariable("lastname") String lastn){
        return new Apimodel(num1,num2,name,lastn);
    }
    //pathvariable value is written for matching with integer values or String value.
    //example above "number" is equal to num1.

    //http://localhost:8080/requestparam?number=1&number2=2&firstname=sss&lastname=got
    @GetMapping("/requestparam")
    public Apimodel requestparameter(@RequestParam(name="number") int num1,
                                     @RequestParam(name="number2") int num2, @RequestParam(name="firstname") String name,@RequestParam(name="lastname") String lastn){
        return new Apimodel(num1,num2,name,lastn);
    }
   /* @GetMapping("/testig")
    public Apimodel experiment(Apimodel apimodel)
    {
        int i = apimodel.getNum1();
        int j = apimodel.getNum2();
        int c = i + j;
        List<Integer> model9 = new ArrayList<>();
        model9.add(c);
        return (Apimodel) model9;
    }*/
}



