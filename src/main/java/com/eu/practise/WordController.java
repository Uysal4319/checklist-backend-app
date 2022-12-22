package com.eu.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private WordRepository repository;

    @PostMapping(path = "/addWord", consumes = "application/json", produces = "application/json")
    public String saveItem(@RequestBody WordItem item){

        List<WordItem> words =  repository.findAll();

        boolean check = false;


        for (WordItem wordItem: words) {

            if (wordItem.getMainWord().equals(item.getMainWord())){
                check =true;
            }
        }


        if(check){
            return "Bu kelime Zaten var";
        }
        repository.save(item);

        return "Added Item id : " + item.getMainWord();

    }

    @GetMapping("/wordlist")
    public List<WordItem> getBooks(){
        System.out.println("################################################\n###############################################");
        return repository.findAll();
    }
}
