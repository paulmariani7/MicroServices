package com.example.paulmariani.Controller;


import com.example.paulmariani.model.Acteur;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@Api(value = "ActeurController", description = "REST Apis related to Acteurs!!!!")
public class ActeurController<firstname> {

    List<Acteur> Acteur = new ArrayList<Acteur>();

    {
        Acteur.add(new Acteur("baba", "money", "10/01/1967", "PEAKYBLINDERS"));
        Acteur.add(new Acteur("Pascal", "Pascal", "23/12/2002", "ELITE"));
        Acteur.add(new Acteur("Dimitri", "PASCA", "07/10/1945", "STRANGER THINGS"));
        Acteur.add(new Acteur("Mariani", "Paul", "07/04/2000", "CASA DEL PAPEL"));
    }

    @ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getActeur")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getAllActeur")
    public List<Acteur> getAllActeur() {
        return Acteur;
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Acteur.class, tags = "getFirstname")
    @RequestMapping(value = "/getFirstname/{firstname}")
    public Acteur getFirstname(@PathVariable(value = "firstname") String firstname) {
        return Acteur.stream().filter(x -> x.getFirstname().equalsIgnoreCase(firstname)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Acteur.class, tags = "getFilmographie")
    @RequestMapping(value = "/getfilmographie/{filmographie}")
    public Acteur getFilmographie(@PathVariable(value = "filmographie") String filmographie) {
        return Acteur.stream().filter(x -> x.getFilmographie().equalsIgnoreCase(filmographie)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Acteur.class, tags = "getDatedenaissance")
    @RequestMapping(value = "/getDatedenaissance/{datedenaissance}")
    public Acteur getDatedenaissance(@PathVariable(value = "datedenaissance") String datedenaissance) {
        return Acteur.stream().filter(x -> x.getDatedenaissance().equalsIgnoreCase(datedenaissance)).collect(Collectors.toList()).get(0);
    }
}
