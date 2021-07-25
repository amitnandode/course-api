package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne()
    private Topic topic;

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }
}
