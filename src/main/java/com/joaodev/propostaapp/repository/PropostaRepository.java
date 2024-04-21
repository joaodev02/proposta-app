package com.joaodev.propostaapp.repository;

import com.joaodev.propostaapp.entity.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository  extends CrudRepository<Proposta, Long> {

}
