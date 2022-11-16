package com.example.paulmariani.Controller;

import com.example.paulmariani.model.Film;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmController {

    List<com.example.paulmariani.model.Film> Film = new ArrayList<Film>();

    {
        Film.add(new Film("PEAKYBLINDERS", "john", "baba", "26/10/22"));
        Film.add(new Film("ELITE", "toto", "Pascal", "31/01/21"));
        Film.add(new Film("STRANGER THINGS", "isma", "Dimitri", "19/11/33"));
        Film.add(new Film("CASA DEL PAPEL", "pablo", "Mariani", "23/12/24"));
    }

    @ApiOperation(value = "Get list of Students in the System ", response = Iterable.class, tags = "getFilm")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getAllFilm")
    public List<Film> getAllFilm() {
        return Film;
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Film.class, tags = "getTitle")
    @RequestMapping(value = "/getTitle/{title}")
    public Film getTitle(@PathVariable(value = "title") String title) {
        return Film.stream().filter(x -> x.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get specific Student in the System ", response = Film.class, tags = "getDatedesortie")
    @RequestMapping(value = "/getDatedesortie/{datedesortie}")
    public Film getDatedesortie(@PathVariable(value = "datedesortie") String datedesortie) {
        return Film.stream().filter(x -> x.getDatesortie().equalsIgnoreCase(datedesortie)).collect(Collectors.toList()).get(0);
    }

}

