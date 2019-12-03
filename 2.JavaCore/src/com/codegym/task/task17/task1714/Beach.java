package com.codegym.task.task17.task1714;

/* 
Comparable
Implement the Comparable<Beach> interface in the Beach class. Beaches will be used by threads, so you need to ensure that all the methods are synchronized.
Implement the compareTo method so that when two beaches are compared the method returns a positive number if the first beach is better
or a negative number if the second beach is better. The magnitude of the number indicates how much better the beach is.


Requirements:
1. The Beach class must have three fields: String name, float distance, int quality.
2. The Beach class should implement the Comparable<Beach> interface.
3. The Beach class's compareTo method should at least account for beach quality and distance.
4. All of the Beach class's methods, except for the main method, must be synchronized.
*/

public class Beach implements Comparable<Beach>{
    private String name;
    private float distance;
    private int quality;

    @Override
    public synchronized int compareTo(Beach o) {
        if(this == o)
            return 0;
        else {
            int i = Integer.compare(this.quality, o.quality);
            int f = Float.compare(this.distance, o.distance);
            int r = i + -f;
            return r;
        }

    }

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}
