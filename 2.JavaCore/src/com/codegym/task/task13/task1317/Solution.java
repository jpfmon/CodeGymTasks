package com.codegym.task.task13.task1317;

/* 
Nice weather
1. Make the Today class implement the Weather interface.
2. Think about the relationship between the parameter type and the getWeatherType() method.
3. The Weather and WeatherType interfaces are already implemented in separate files.


Requirements:
1. The Today class must implement the Weather interface.
2. The Weather interface's getWeatherType method must be implemented in the Today class.
3. The getWeatherType method must return a String.
4. The getWeatherType method must return the value of the variable type.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather{
        private String type;

        @Override
        public String getWeatherType() {
            return this.type;
        }

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
}
