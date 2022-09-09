package com.example.engineering_process_tools.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.engineering_process_tools.model.item;
import com.example.engineering_process_tools.controller.AddResponse;
import org.springframework.stereotype.Component;

@Component
public class item_service {

    static HashMap<Integer,item> itemIDMap;

    public item_service()
    {
        itemIDMap = new HashMap<Integer,item>();

        item pizzaItem = new item(1, "Pizza", "Yummy", 10.00);
        item icecreamItem = new item(2, "IceCream", "Yummier", 5.00);
        item broccoliItem = new item(3, "Broccoli", "Not Yummy", 3.00);

        itemIDMap.put(1,pizzaItem);
        itemIDMap.put(2,icecreamItem);
        itemIDMap.put(3,broccoliItem);
    }

    public List getAllItems()
    {
        List items = new ArrayList(itemIDMap.values());
        return items;
    }

    public item getItembyID(int id)
    {
        item item = itemIDMap.get(id);
        return item;
    }

    public item getItembyName(String itemName)
    {
       item item = null;
       for (int i:itemIDMap.keySet())
       {
           if(itemIDMap.get(i).getName().equals(itemName))
               item = itemIDMap.get(i);
       }
       return item;
    }

    public item addItem(item item)
    {
        item.setId(getMaxId());
        itemIDMap.put(item.getId(), item);
        return item;
    }

    public static int getMaxId()
    {
        int max=0;
        for (int id: itemIDMap.keySet())
            if(max<=id)
                max=id;
        return max+1;
    }

    public item updateitem(item item)
    {
        if(item.getId()>0)
            itemIDMap.put(item.getId(), item);
        return item;
    }

    public AddResponse deleteitem(int id)
    {
        itemIDMap.remove(id);
        AddResponse res = new AddResponse();
        res.setMsg("Item has been deleted");
        res.setId(id);
        return res;
    }

}
