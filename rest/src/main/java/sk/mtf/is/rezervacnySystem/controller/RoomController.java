package sk.mtf.is.rezervacnySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.Building;
import sk.mtf.is.rezervacnySystem.model.Room;
import sk.mtf.is.rezervacnySystem.model.User;
import sk.mtf.is.rezervacnySystem.repository.RoomRepository;
import sk.mtf.is.rezervacnySystem.services.RoomService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "localhost:4200")
public class RoomController {

    @Autowired
    private RoomService roomSerivce;

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping(path = "/rooms")
    private List<Room> getAllRooms(){return roomSerivce.getAllRooms();}

    @PostMapping(path = "rooms/add")
    private @ResponseBody String createNewRoom(@RequestParam Integer pocetStolov, Building idBudovy, User vytvoriloId)
    {
        Room r = new Room();
        r.setVytvoriloID(vytvoriloId);
        r.setIdBudovy(idBudovy);
        r.setPocetStolov(pocetStolov);
        roomRepository.save(r);

        return "Created";
    }

    @GetMapping(path = "/room/{roomId}")
    private Room getRoomsById(@PathVariable("roomId") int roomId) {return roomSerivce.getRoomsById(roomId);}

}
