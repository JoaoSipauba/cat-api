package br.edu.ceuma.catapi.service;

import br.edu.ceuma.catapi.entity.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CatService {
    List<Cat> cats = Arrays.asList(
            new Cat("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSC7yROYEc61aSxXiwVuVD3rJzic5VofTn5gw&usqp=CAU", "sphynx"),
            new Cat("https://www.petlove.com.br/images/breeds/223870/profile/original/perfil-himalaio.jpg?1595617107", "himalaio"),
            new Cat("https://www.equilibriototalalimentos.com.br/imagens/info3/524.png", "bengal")
    );
    public ResponseEntity getCatByName(String name){
        name = name.toLowerCase();
        for (Cat cat : this.cats){
            if (cat.getName().equals(name)){
                return new ResponseEntity(cat, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Não existem gatos com esse nome", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity getAllCats(){
        return new ResponseEntity(this.cats, HttpStatus.OK);
    }
}
