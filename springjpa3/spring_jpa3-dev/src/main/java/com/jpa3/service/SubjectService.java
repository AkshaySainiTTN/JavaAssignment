package com.jpa3.service;
import com.jpa3.entities.Subject;
import com.jpa3.repo.SubjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
    public void addSubject(Subject subject){
        subjectRepository.save(subject);
    }
    @Transactional
    public void testingTransaction(Subject subject){
        subjectRepository.save(subject);
    }
}
