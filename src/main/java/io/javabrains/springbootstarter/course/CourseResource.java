package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
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
public class CourseResource {

    private final CourseService courseService;

    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAll(@PathVariable String topicId) {
        return courseService.getCourses(topicId);
    }

    @GetMapping("topics/{topicId}/courses/{courseId}")
    public Course get(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public void update(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{courseId}")
    public void delete(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}

