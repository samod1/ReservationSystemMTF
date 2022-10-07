package sk.mtf.is.rezervacnySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.Building;
import sk.mtf.is.rezervacnySystem.repository.BuildingRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/building")
@CrossOrigin(origins = "localhost:4200")
public class BuildingController {
    @Autowired
    private BuildingRepository buildingRepository;


    @PostMapping(path = "/create")
    public @ResponseBody String addNewBuilding(@RequestParam String nazov,@RequestParam String skratka,
                                               @RequestParam Integer pocet_poschodi)
    {
        Building b = new Building();
        b.setNazov(nazov);
        b.setSkratka(skratka);
        b.setPocet_poschodi(pocet_poschodi);
        buildingRepository.save(b);
        return "Created";
    }

    @GetMapping (path = "/all")
    public @ResponseBody Iterable<Building> getAllBuildings()
    {
        return buildingRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<Building> getBuildingById(@PathVariable("id") Integer id)
    {
        return buildingRepository.findById(id);
    }

    @GetMapping(path = "/delete/{id}")
    /**
     *
     * @param id
     *
     */
    public ResponseEntity<Building> deleteById(@PathVariable("id") Integer id)
    {
        buildingRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /*@PutMapping(path = "/edit/{id}")*/


}

