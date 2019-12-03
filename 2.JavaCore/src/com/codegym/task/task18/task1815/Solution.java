package com.codegym.task.task18.task1815;

import java.util.List;

/* 
Table
Change the TableInterfaceWrapper class so that it wraps TableInterface.
The setModel method should display the number of elements in the new list before updating the model.
The getHeaderText method should return the text in upper case. Use the toUpperCase() method.


Requirements:
1. The TableInterfaceWrapper class must implement the TableInterface interface.
2. The TableInterfaceWrapper class must initialize a TableInterface field in the constructor.
3. The setModel() method should display the number of elements in the new list before updating the model.
4. The getHeaderText() method must return the text in uppercase.
5. The setHeaderText() method must set the header text without making changes.
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}