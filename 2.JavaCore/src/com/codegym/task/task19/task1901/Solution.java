package com.codegym.task.task19.task1901;

/* 
TableAdapter
Edit the TableAdapter class so that it adapts the ATable interface to the BTable interface.
The getHeaderText method should return "[<username>] : <table name>".

For example, "[Amigo] : DashboardTable".


Requirements:
1. The Solution class must have a public static ATable interface.
2. The Solution class must have a public static BTable interface.
3. The Solution class must have a public static TableAdapter class.
4. The TableAdapter class must implement the BTable interface.
5. The TableAdapter class must have a private ATable field called aTable.
6. The TableAdapter class must have a constructor with an ATable parameter.
7. The TableAdapter class must override the getHeaderText method in accordance with the task conditions.
*/

public class Solution {
    public static void main(String[] args) {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable{

        private ATable aTable;

        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return "["+ aTable.getCurrentUserName() +"]" + " : " + aTable.getTableName();
        }
    }

    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}