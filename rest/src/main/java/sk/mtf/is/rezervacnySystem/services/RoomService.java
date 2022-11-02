package sk.mtf.is.rezervacnySystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.mtf.is.rezervacnySystem.model.Room;
import sk.mtf.is.rezervacnySystem.repository.RoomRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms(){
        List<Room> rooms = new ArrayList<Room>();
        roomRepository.findAll().forEach(room1 -> rooms.add(room1));

        return rooms;
    }

}
