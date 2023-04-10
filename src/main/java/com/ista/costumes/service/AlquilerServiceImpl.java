package com.ista.costumes.service;


import com.ista.costumes.entity.Alquiler;
import com.ista.costumes.repositorio.AlquilerRepo;
import com.ista.costumes.repositorio.BaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AlquilerServiceImpl extends BaseServiceImpl<Alquiler, Long> implements AlquilerService {

    @Autowired
    private AlquilerRepo repo;

    public AlquilerServiceImpl(BaseRepo<Alquiler, Long> baseRepository) {
        super(baseRepository);
    }

}
