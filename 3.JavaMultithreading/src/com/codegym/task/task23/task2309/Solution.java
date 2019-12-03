package com.codegym.task.task23.task2309;

import com.codegym.task.task23.task2309.vo.*;

import java.util.List;

/* 
Sometimes anonymity is so nice!
1. In the vo package, create public User, Location, Server, Subject, and Subscription classes, which inherit NamedItem
2. In the Solution class, for each class, create a method that returns a list of instances of the class.

For example, the User class will have a public List<User> getUsers() method
For the Location class, it will be public List<Location> getLocations() method

3. In each of these methods, create an anonymous class from AbstractDbSelectExecutor and call the required method on it.
Hint:
the body of the method should begin like this: return new AbstractDbSelectExecutor

4. Example output for User and Location:

Id=5, name='User-5', description=Received from executing 'SELECT * FROM USER'
Id=1, name='Location-1', description=Received from executing 'SELECT * FROM LOCATION'
5. Analyze the example output and create the correct query for all classes.


Requirements:
1. A public User class that inherits the NamedItem class must be created in the vo package.
2. A public Location class that inherits NamedItem must be created in the vo package.
3. A public Server class that inherits NamedItem must be created in the vo package.
4. A public Subject class that inherits NamedItem must be created in the vo package.
5. A public Subscription class that inherits NamedItem must be created in the vo package.
6. An AbstractDbSelectExecutor object with a User parameter must be created in the getUsers method.
7. An AbstractDbSelectExecutor object with a Location parameter must be created in the getUsers method.
8. An AbstractDbSelectExecutor object with a Server parameter must be created in the getUsers method.
9. An AbstractDbSelectExecutor object with a Subject parameter must be created in the getUsers method.
10. An AbstractDbSelectExecutor object with a Subscription parameter must be created in the getUsers method.
11. The getUsers method must return the correct list (according to the task conditions).
12. The getLocations method must return the correct list (according to the task conditions).
13. The getServers method must return the correct list (according to the task conditions).
14. The getSubjects method must return the correct list (according to the task conditions).
15. The getSubscriptions method must return the correct list (according to the task conditions).
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        print(solution.getUsers());
//        print(solution.getLocations());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }
}
