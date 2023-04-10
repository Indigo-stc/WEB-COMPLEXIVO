package com.ista.costumes.service;

import com.ista.costumes.entity.Disfraz;
import com.ista.costumes.repositorio.BaseRepo;
import com.ista.costumes.repositorio.DisfrazRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DisfrazServiceImpl extends BaseServiceImpl<Disfraz, Long> implements DisfrazService {

    @Autowired
    private DisfrazRepo repo;

    public DisfrazServiceImpl(BaseRepo<Disfraz, Long> baseRepository) {
        super(baseRepository);
    }

}
