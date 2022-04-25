package com.api.card.impl;

import com.api.card.model.Spents;
import com.api.card.model.dto.SpentDto;
import com.api.card.repository.CardRepository;
import com.api.card.service.CardService;
import lombok.AllArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {

    @Autowired
    private final CardRepository cardRepository;

    @Override
    public Spents create(SpentDto spentRequest) {
        LocalDateTime date = LocalDateTime.now();
        Spents spents = new Spents();
        spents.setName(spentRequest.getName());
        spents.setDescription(spentRequest.getDescription());
        spents.setRegisterDt(date);
        spents.setValue(spentRequest.getValue());
        spents.setTags(spentRequest.getTags());

        return cardRepository.save(spents);
    }

    @Override
    public List<Spents> getAll() {
        return cardRepository.findAll();
    }

    @Override
    public Spents getId(Long id) {
        return cardRepository.getById(id);
    }
}
