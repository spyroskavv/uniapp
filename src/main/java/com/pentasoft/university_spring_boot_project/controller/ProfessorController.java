package com.pentasoft.university_spring_boot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pentasoft.university_spring_boot_project.entity.Professor;
import com.pentasoft.university_spring_boot_project.service.ProfessorService;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/professors/{id}")
    public String getProfessorById(@PathVariable Long id, Model model) {
        Professor professor = professorService.getProfessorById(id);
        model.addAttribute("professor", professor);
        model.addAttribute("courses", professor.getCourses());
        return "professor-details";
    }

    @GetMapping("/professors")
    public String getAllProfessors(Model model) {
        model.addAttribute("professors", professorService.getAllProfessors());
        return "professors";
    }

    @GetMapping("/professors/new")
    public String createProfessorForm(Model model) {
        model.addAttribute("professor", new Professor());
        return "professor-form";
    }

    @PostMapping("/professors")
    public String saveProfessor(@ModelAttribute Professor professor) {
        professorService.saveProfessor(professor);
        return "redirect:/professors";
    }

    @GetMapping("/professors/edit/{id}")
    public String editProfessorForm(@PathVariable Long id, Model model) {
        Professor professor = professorService.getProfessorById(id);
        if (professor == null) {
            model.addAttribute("message", "Professor not found.");
            return "error";
        }
        model.addAttribute("professor", professor);
        return "professor-form";
    }

    @PostMapping("/professors/{id}")
    public String updateProfessor(@PathVariable Long id, @ModelAttribute Professor updatedProfessor) {
        professorService.updateProfessor(id, updatedProfessor);
        return "redirect:/professors";
    }

    @GetMapping("/professors/delete/{id}")
    public String deleteProfessor(@PathVariable Long id) {
        professorService.deleteProfessor(id);
        return "redirect:/professors";
    }    
}
