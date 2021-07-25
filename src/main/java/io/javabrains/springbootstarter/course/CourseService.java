package io.javabrains.springbootstarter.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("OptionalGetWithoutIsPresent")
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repo;

    public List<Course> getCourses(String topicId) {
        return repo.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return repo.findById(id).get();
    }

    public void addCourse(Course course) {
        repo.save(course);
    }

    public void updateCourse(Course course) {
        repo.save(course);
    }

    public void deleteCourse(String id) {
        repo.deleteById(id);
    }
}
