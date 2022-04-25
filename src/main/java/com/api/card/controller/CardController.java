package com.api.card.controller;


import com.api.card.model.Spents;
import com.api.card.model.dto.SpentDto;
import com.api.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
@Transactional
public class CardController {

    @Autowired
    private final CardService service;

    public CardController(CardService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Spents> create(@RequestBody SpentDto spentRequest ) {
        Spents spents = service.create(spentRequest);
        return ResponseEntity.ok(spents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Spents> getById(@PathVariable(value = "id") Long id ) {
        Spents spents = service.getId(id);
        return ResponseEntity.ok(spents);
    }

    @GetMapping
    public ResponseEntity<List<Spents>> getAll() {
        List<Spents> spents = service.getAll();
        return ResponseEntity.ok(spents);
    }
}
