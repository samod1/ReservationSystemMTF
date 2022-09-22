package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sk.mtf.is.rezervacnySystem.model.Building;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {
    @Query("select b.nazov, b.skratka from Building b")
    Iterable<Building> getBuildingBy();

}
