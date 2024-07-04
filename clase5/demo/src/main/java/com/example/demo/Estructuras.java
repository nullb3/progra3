package com.example.demo;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Estructuras {
    private List<String> infoList;
    private Queue<String> infoQueue;

    public Estructuras(){
        this.infoList = new ArrayList<>();
        this.infoQueue = new LinkedList<>();
    }

    public List<String> getInfoList(){
        return infoList;
    }

    public Queue<String> getQueueList(){
        return infoQueue;
    }

    public void createList(){
        infoList.clear();
        infoList.add("1L");
        infoList.add("2L");
        infoList.add("3L");
    }

    public List<String> addToList(String info){
        infoList.add(info);
        return infoList;
    }

    public void createQueue(){
        infoQueue.clear();
        infoQueue.add("1Q");
        infoQueue.add("2Q");
        infoQueue.add("3Q");
    }
}

