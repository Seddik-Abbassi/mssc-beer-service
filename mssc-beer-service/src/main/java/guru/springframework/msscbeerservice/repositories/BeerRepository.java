package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, String> {
}
