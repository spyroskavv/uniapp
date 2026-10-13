package com.pentasoft.university_spring_boot_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pentasoft.university_spring_boot_project.entity.Professor;
import com.pentasoft.university_spring_boot_project.repository.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    // Retrieve all professors
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    // Retrieve a professor by its ID
    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public void saveProfessor(Professor professor) {
        professorRepository.save(professor);
    }
    
    public void updateProfessor(Long id, Professor updatedProfessor) {
        Professor existingProfessor = professorRepository.findById(id).orElse(null);
        if (existingProfessor != null) {
            existingProfessor.setName(updatedProfessor.getName());
            professorRepository.save(existingProfessor);
        }
    }
    
    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }    
}
