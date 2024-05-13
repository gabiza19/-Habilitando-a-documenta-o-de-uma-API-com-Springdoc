package br.com.projectDocument.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project-document-api")
public class ProjectDocumentController {
    @GetMapping(value = "/project-document", produces = "application/json")
    public String teste(){

        return "teste";
    }

}
