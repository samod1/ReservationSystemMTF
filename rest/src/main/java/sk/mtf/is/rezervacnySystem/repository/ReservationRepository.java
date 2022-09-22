package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.mtf.is.rezervacnySystem.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
