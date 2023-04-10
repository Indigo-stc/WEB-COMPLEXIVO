package com.ista.costumes.service;

import com.ista.costumes.entity.Cliente;
import com.ista.costumes.repositorio.BaseRepo;
import com.ista.costumes.repositorio.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired
    private ClienteRepo repo;

    public ClienteServiceImpl(BaseRepo<Cliente, Long> baseRepository) {
        super(baseRepository);
    }

}
