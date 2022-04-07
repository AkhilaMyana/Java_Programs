package java_oops;

import java.util.LinkedList;
import java.util.*;
public class QueueEx 
{
    public static void main(String[] args) 
    {
        Queue<String> locationsQueue = new LinkedList<String>();
        locationsQueue.add("Kolkata");
        locationsQueue.add("Patna");
        locationsQueue.add("Delhi");
        locationsQueue.add("Gurgaon");
        locationsQueue.add("Noida");
        locationsQueue.add("GOA");
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Size of Queue : " + locationsQueue.size());
        System.out.println("Head of Queue : " + locationsQueue.peek());
        locationsQueue.remove();
        System.out.println("Queue is : " + locationsQueue);
        System.out.println("Head of Queue : " + locationsQueue.peek());
        System.out.println("Size of Queue : " + locationsQueue.size());
    }
}
