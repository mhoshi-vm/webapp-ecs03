package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/get")
    public List<DemoEntity> getter(){
        return demoRepository.findAll();
    }

    @PostMapping("/post")
    public void setter(@RequestParam String demoValue){
        // hoge
        DemoEntity demo = new DemoEntity();
        demo.setDemoValue(demoValue);

        demoRepository.save(demo);
    }
}
