package com.codegym.task.task17.task1713;

import java.util.*;

/* 
Shared list
1. Change the Solution class so that it becomes a list. (It must implement the java.util.List interface).
2. The Solution list should only work with Longs.
3. Use the original field.
4. The list will be used by threads, so you need to ensure that all the methods are synchronized.


Requirements:
1. The Solution class must implement the List<Long> interface.
2. The Solution class must have a private ArrayList<Long> field called original.
3. All of the List interface's overridden methods must delegate calls to the methods of the original object.
4. All of the Solution class's methods, except for the main method, must be synchronized
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<>();

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return original.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        return original.addAll(index,c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return original.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index,element);
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index,element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public  synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex,toIndex);
    }

    public static void main(String[] args) {

    }
}
