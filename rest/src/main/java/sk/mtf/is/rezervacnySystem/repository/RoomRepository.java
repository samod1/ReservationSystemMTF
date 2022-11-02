package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.mtf.is.rezervacnySystem.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
