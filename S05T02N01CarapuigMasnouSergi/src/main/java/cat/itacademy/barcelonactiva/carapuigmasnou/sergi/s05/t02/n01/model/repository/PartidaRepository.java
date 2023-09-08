package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.domain.Partida;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PartidaRepository extends MongoRepository<Partida, Integer> {
    List<Partida> findByJugadorId(Integer id);
    // Custom query methods can be defined here
}
