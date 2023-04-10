package com.ista.costumes.repositorio;

import com.ista.costumes.entity.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends BaseRepo<Cliente, Long> {
}
