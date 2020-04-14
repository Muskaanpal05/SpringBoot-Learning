package muskaan.springboot.learning;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

  private List<Topic> topics=Arrays.asList(
          new Topic("spring", "Spring Framework" , "Spring Framework Description"),

        new Topic("java", "Core java" , "Core Java Description"),

        new Topic("javascript", "javascript" , "Javascript Description")

        );
  public List<Topic> getAllTopics(){
      return topics;
  }

}
