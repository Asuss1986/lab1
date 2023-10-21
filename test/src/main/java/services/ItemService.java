package services;

import models.Item;
import java.util.ArrayList;
import java.util.List;


public class ItemService {
	
	
	    private List<Item> items = new ArrayList<>();
	    private int nextId = 1;

	    public Item createItem(String name, String description) {
	        Item item = new Item();
	        item.setId(nextId++);
	        item.setName(name);
	        item.SetDescription(description);
	        items.add(item);
	        return item;
	    }

	    public List<Item> getItems() {
	        return items;
	    }

	    public Item getItemById(int id) {
	        for (Item item : items) {
	            if (item.getId() == id) {
	                return item;
	            }
	        }
	        return null;
	    }

	    public Item updateItem(int id, String name, String description) {
	        Item item = getItemById(id);
	        if (item != null) {
	            item.setName(name);
	            ( item).SetDescription(description);
	        }
	        return item;
	    }

	    public void deleteItem(int id) {
	        Item item = getItemById(id);
	        if (item != null) {
	            items.remove(item);
	        }
	   

		
			
		}
	}
	