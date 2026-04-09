package com.example.backend.service;

import com.example.backend.entity.Student;
import com.example.backend.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student save(Student student) {
        return repo.save(student);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student update(Long id, Student s) {
        Student existing = repo.findById(id).orElseThrow();
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setCourse(s.getCourse());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}