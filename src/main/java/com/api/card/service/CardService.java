package com.api.card.service;

import com.api.card.model.Spents;
import com.api.card.model.dto.SpentDto;

import java.util.List;

public interface CardService {

   Spents create(SpentDto spentRequest);
   List<Spents> getAll();
   Spents getId(Long id);
}
