package io.javabrains.springbootstarter.topic;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("unused")
@RestController
@AllArgsConstructor
public class TopicResource {

    private final TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAll() {
        return topicService.getTopics();
    }

    @GetMapping("topics/{id}")
    public Topic get(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @DeleteMapping("topics/{id}")
    public void delete(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}

