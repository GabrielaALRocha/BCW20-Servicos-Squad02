package com.soulcode.Servicos.Repositories;

import com.soulcode.Servicos.Models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CargoRepository  extends JpaRepository<Cargo, Integer> {

    //procurar cargo pelo nome
    Optional<Cargo> findByNome(String nome);


}
