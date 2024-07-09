package cse.poc.spring_poc_crud;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//backend router: accept the request and process
@RestController
public class BasicRest {
    private String[] industryVerticals={
            "Banking","Logistics","Health","Automation","Government","Transport"
    };

    @DeleteMapping("/remove/{index}")
    public String invalidate(@PathVariable("index") int index){
        String response = industryVerticals[index]+ "has deleted";
        industryVerticals[index]=null;
        return response;
    }
    @GetMapping("/particular/{index}")
    public String getOneIndustry(@PathVariable("index") int index){
        return industryVerticals[index];
    }
    @GetMapping("/industries")
    public String[] getIndustries(){
        return industryVerticals;
    }
}
