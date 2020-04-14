package muskaan.springboot.learning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController{

    @RequestMapping("/topics")
    public String getTopics(){
        return "All Topics";
    }

}
