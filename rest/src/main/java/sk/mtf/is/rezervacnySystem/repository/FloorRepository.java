package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.mtf.is.rezervacnySystem.model.Floor;

public interface FloorRepository extends JpaRepository<Floor,Integer> {
}
