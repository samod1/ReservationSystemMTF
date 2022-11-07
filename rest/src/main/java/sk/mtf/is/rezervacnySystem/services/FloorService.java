package sk.mtf.is.rezervacnySystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import sk.mtf.is.rezervacnySystem.repository.FloorRepository;

public class FloorService {

    @Autowired
    public FloorRepository floorRepository;
}
