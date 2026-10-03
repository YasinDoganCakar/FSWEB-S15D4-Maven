package org.example;

import java.util.ArrayList;

public class WorkintechList extends ArrayList {

    public WorkintechList(){
        super();
    }
    @Override
    public boolean add(Object o){
        if(!super.contains(o)){
            super.add(o);
            return true;
        }
        return false;
    }

    public void sort(){
        super.sort(null);
    }

    @Override
    public boolean remove(Object o){
        if(super.remove(o)){
            sort();
            return true;
        }
        return false;
    }
}
