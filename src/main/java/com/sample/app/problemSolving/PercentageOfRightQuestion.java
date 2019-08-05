package com.sample.app.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class PercentageOfRightQuestion {
    /**
     * pass 2 String array parameter to method question and answer resp.
     * question will contains exam name, question no and section.
     * like code1, code2a, code2b
     * so code will be exam name 1 2 will be question no and a , b will be sections
     * Note a section might be present or absent
     * <p>
     * so analyze question with respective answers if any of question is false whole section will be false
     * if any section is false whole question will be consider as false.
     * <p>
     * and method should return percentage of right question in int.
     */

    public static int getData(String question[], String answer[]) {
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < question.length; i++) {
            String[] questionSplit = question[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

            if (map.containsKey(questionSplit[0] + questionSplit[1])) {
                Boolean aBoolean = map.get(questionSplit[0] + questionSplit[1]);
                if (aBoolean) {
                    if (!answer[i].equalsIgnoreCase("Ok")) {
                        map.put(questionSplit[0] + questionSplit[1], Boolean.FALSE);
                    }
                }
            } else {
                if (answer[i].equalsIgnoreCase("Ok")) {
                    map.put(questionSplit[0] + questionSplit[1], Boolean.TRUE);
                } else
                    map.put(questionSplit[0] + questionSplit[1], Boolean.FALSE);
            }
        }

        float count = 0;

        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (entry.getValue())
                count++;
        }
        return (int) ((count / map.size()) * 100);
    }

    public static void main(String[] args) {
        String[] question = new String[]{
                "code1", "code1a", "code2", "code3"
        };

        String[] answer = new String[]{
                "ok", "no", "ok", "ok"
        };

        System.out.println(getData(question, answer));
    }
}
