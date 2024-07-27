/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cursos.swing_cursos.Model.repository.controller;

import br.com.ifba.cursos.swing_cursos.Model.Curso;
import br.com.ifba.cursos.swing_cursos.Model.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hmart
 */
@RestController
@RequestMapping("/Curso")
public class UsuarioController {
    @Autowired
    private CursoRepository CursoRepository;

    @GetMapping
    public List<Curso> listarTodos() {
        return CursoRepository.findAll();
    }

    @PostMapping
    public Curso criarUsuario(@RequestBody Curso Curso) {
        return CursoRepository.save(Curso);
    }
}
