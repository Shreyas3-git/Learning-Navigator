package com.crio.learningnavigator.service;

import com.crio.learningnavigator.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService
{
    @Autowired
    private SubjectRepository subjectRepository;
}
