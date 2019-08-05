package com.sample.app.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxTempDifference {
    /**
     *
     * Take input int array contains temperature and divide it to equal 4 season size
     * You have to calculate every seasons max and min temp difference.
     * and return name of season which has max temp difference.
     *
     */

    public static String getHighestTemp(int[] input) {
        String[] seasons = {"season1", "season2", "season3", "season4"};
        List<Season> ans  = new ArrayList<>();

        int grpSize = input.length / seasons.length;
        int index = 0;

        for (int i = 0; i < seasons.length; i++) {
            List<Integer> list = new ArrayList<>();

            int end = index + grpSize;
            for (int j = index; j < end; j++) {
                list.add(input[j]);
            }
            index += grpSize;

            Collections.sort(list);
            int temperature = list.get(list.size() - 1) - list.get(0);

            ans.add(new Season(temperature,seasons[i]));
        }

        Collections.sort(ans, new Comparator<Season>() {
            @Override
            public int compare(Season o1, Season o2) {
                return o2.getTemp().compareTo(o1.getTemp());
            }
        });
        return ans.get(0).getName();
    }

    public static void main(String[] args) {
        int[] temp = {1, 3, 9, 15, 10, 6, 17, 1};

        System.out.println(getHighestTemp(temp));
    }
}

class Season {
    private Integer temp;
    private String name;

    public Season(Integer temp, String name) {
        this.temp = temp;
        this.name = name;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "temp=" + temp +
                ", name='" + name + '\'' +
                '}';
    }
}

