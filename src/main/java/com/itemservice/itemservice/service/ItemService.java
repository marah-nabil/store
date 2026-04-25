
package com.itemservice.itemservice.service;


public class ItemService {
    
    private final ItemRepository itemRepository;
    
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    
    public Optional
        <Item> getItemById(){
        return itemRepository.findAll();
    }
}
}
