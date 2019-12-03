package com.codegym.task.task20.task2024;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Introducing graphs
Read the additional materials on serialization of graphs.
The Solution class has a directed planar graph containing cycles and loops.

For example, https://photos.app.goo.gl/fgJjYtA2atEP6AKM7

Serialize Solution.
The direction of all of the edges must remain the same.


Requirements:
1. The Solution class must have an edges field.
2. The Solution class must have a node field.
3. The node field must be an int.
4. The Solution class should support the Serializable interface.
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {

    }
}
