package com.Microservices.ProducerService.Service;

import com.Microservices.ProducerService.Model.Enseignant;
import com.Microservices.ProducerService.Repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnseignantService {
    @Autowired
    EnseignantRepository EnsRepository;
    public void addNewEnseignant(Enseignant ens){
        EnsRepository.save(ens);
    }
}
