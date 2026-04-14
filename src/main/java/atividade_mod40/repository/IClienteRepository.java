package atividade_mod40.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import atividade_mod40.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}


