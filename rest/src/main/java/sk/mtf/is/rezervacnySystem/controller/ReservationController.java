package sk.mtf.is.rezervacnySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.mtf.is.rezervacnySystem.model.Reservation;
import sk.mtf.is.rezervacnySystem.repository.ReservationRepository;

@RestController
@RequestMapping(path = "/reservations")

public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String createNewReseravation (@RequestParam String datum_od, String datum_do, Integer userId, Integer idMiestnost, Integer idStolu)
    {
        Reservation r = new Reservation();
        r.setDatum_od(datum_od);
        r.setDatum_do(datum_do);
        r.setUserId(userId);
        r.setIdMiestnost(idMiestnost);
        r.setIdStolu(idStolu);
        reservationRepository.save(r);
        return "Created";

    }

}
