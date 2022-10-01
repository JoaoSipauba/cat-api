package br.edu.ceuma.catapi.controller;

import br.edu.ceuma.catapi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/cat")
    public ResponseEntity getCatByName(@RequestParam(value = "name") String name) {
        return catService.getCatByName(name);
    }

    @GetMapping("/cats")
    public ResponseEntity getAllCats(){
        return catService.getAllCats();
    }
}
