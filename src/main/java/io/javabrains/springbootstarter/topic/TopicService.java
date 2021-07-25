package io.javabrains.springbootstarter.topic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository repo;

    public List<Topic> getTopics() {
        return repo.findAll();
    }

    public Topic getTopic(String id) {
        return repo.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        repo.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        repo.save(topic);
    }

    public void deleteTopic(String id) {
        repo.deleteById(id);
    }
}
