package com.eutest.eutest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    @Autowired
    private CheckListRepository repository;

    @PostMapping("/addItemObj")
    public String saveItem(@RequestBody CheckItem item){

        repository.save(item);

        return "Added Item id : " + item.getId();

    }
    @PostMapping("/addItem")
    public String saveItem(@RequestBody String item){
        CheckItem checkItem = new CheckItem();
        checkItem.setStatus(false);
        checkItem.setText(item);
        checkItem.setId(repository.findAll().size());

        repository.save(checkItem);

        return "Added Item id : " +item ;

    }

    @PostMapping("/updateItems")
    public String updateItems(@RequestBody List<CheckItem> items){

       List<CheckItem> oldItems = repository.findAll();

        for (CheckItem newItem :items ) {
            for (CheckItem oldItem : oldItems ){
                if(newItem.getId() == oldItem.getId()){

                    oldItem.setStatus(newItem.getStatus());
                    repository.save(oldItem);

                }

            }
        }

        return "Update Items";

    }

    @GetMapping("/findAllItem")
    public List<CheckItem> getItems(){
        System.out.println("################################################\n###############################################");
        return repository.findAll();
    }

    @GetMapping("/findAllItem/{id}")
    public Optional<CheckItem> getItem(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable int id){
        repository.deleteById(id);
        return "item deleted : " + id;
    }
}
