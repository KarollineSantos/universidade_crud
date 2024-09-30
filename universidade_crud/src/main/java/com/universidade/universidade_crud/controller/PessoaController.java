package com.universidade.universidade_crud.controller;

import com.universidade.universidade_crud.dto.PessoaDTO;
import com.universidade.universidade_crud.model.Pessoa;
import com.universidade.universidade_crud.repository.PessoaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @PostMapping
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(pessoaDTO.getNome());
        novaPessoa.setCpf(pessoaDTO.getCpf());
        novaPessoa.setIdade(pessoaDTO.getIdade());

        Pessoa pessoaSalva = pessoaRepository.save(novaPessoa);
        return ResponseEntity.ok(pessoaSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> obterPessoaPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}