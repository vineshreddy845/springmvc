package com.example.springmvc.service;

import com.example.springmvc.pojo.Apimodel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service

public class ApiService {

    public List<Integer> Addition(Apimodel apimodel) {
        int i = apimodel.getNum1();
        int j = apimodel.getNum2();
        int c = i + j;
        List<Integer> a = new ArrayList<>();
        a.add(c);
        return a;
    }

    public String sub2(Apimodel apimodel) {
        String a = apimodel.getName();
        String b = apimodel.getLastn();
        String c = (a + b);
        List<String> p = new ArrayList<>();
        p.add(c);
        return c;
    }


    public Apimodel apimodels() {// how it looks like Apimodel apimodel = new Apimodel();

        return new Apimodel(1,2,"ka","par");
    }

    public List<Apimodel> apimodel4()
    {
        List<Apimodel> model = new ArrayList<>();
        model.add(new Apimodel(1,2,"mansa","na"));
        return model;
    }
}
