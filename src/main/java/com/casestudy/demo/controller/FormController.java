package com.casestudy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.casestudy.demo.model.Form;
import com.casestudy.demo.repository.FormRepository;

@Controller
@RequestMapping("/")
public class FormController {

    private final FormRepository formRepo;

    public FormController(FormRepository formRepo) {
        this.formRepo = formRepo;
    }

    @GetMapping("/liste")
    public String list(Model model) {
        model.addAttribute("items", formRepo.findAll());

        return "forms";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("form", new Form());
        return "add_form";
    }

    @PostMapping("/save")
    public RedirectView save(@ModelAttribute("form") Form form, RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/add", true);
        Form savedForm = formRepo.create(form);
        redirectAttributes.addFlashAttribute("saveForm", savedForm);
        redirectAttributes.addFlashAttribute("success", true);
        return redirectView;
    }
}