package com.example.doceria.controller;

import com.example.doceria.doce.Doce;
import com.example.doceria.doce.DoceRepository;
import com.example.doceria.doce.DoceRequestDTO;
import com.example.doceria.doce.DoceResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doce")
public class DoceController {

    @Autowired
    private DoceRepository repository;

    @CrossOrigin(origins = "*", allowCredentials = "*")
    @PostMapping
    public void saveDoce(@RequestBody DoceRequestDTO data){
        Doce doceData = new Doce(data);
        repository.save(doceData);
        return;
    }
    @GetMapping
    public List<DoceResponseDTO> getAll(){

        List<DoceResponseDTO> doceList = repository.findAll().stream().map(DoceResponseDTO::new).toList();
        return doceList;
    }
}
