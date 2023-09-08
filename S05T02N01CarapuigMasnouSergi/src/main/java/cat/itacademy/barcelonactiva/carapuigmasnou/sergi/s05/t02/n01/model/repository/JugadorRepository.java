package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.domain.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JugadorRepository extends MongoRepository<Jugador, Integer> {
    // Custom query methods can be defined here
}
