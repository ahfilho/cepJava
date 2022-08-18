package com.sigabem.SigaBem.controller;

import com.sigabem.SigaBem.entity.CepOrigem;
import com.sigabem.SigaBem.service.SigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/siga")
public class SigaController {

    @Autowired
    private SigaService service;

    @PostMapping()
    public ResponseEntity<String> calculoFrete(@RequestBody @Validated CepOrigem cepOrigem) throws IOException {

        try {
            this.service.consultaCep(cepOrigem);
            return ResponseEntity.status(HttpStatus.OK).body(String.format("CEP " + cepOrigem.getCepOrigem() + " encontrado!"));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).body(String.format("CEP " + cepOrigem.getCepOrigem() + " não encontrado!"));

        }
    }

    @GetMapping
    public ResponseEntity<List<CepOrigem>> encomendaList() {
        return ResponseEntity.ok().body((this.service.encomendaList()));
    }

}

