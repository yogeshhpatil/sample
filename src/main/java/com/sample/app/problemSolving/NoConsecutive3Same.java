package com.sample.app.problemSolving;

public class NoConsecutive3Same {
    /**
     * write a function that will given 2 integer A and B, returns String containing exactly
     * A letters 'a' and exactly B letters 'b' with no three letters being the same.
     * (neither 'aaa' nor 'bbb' may occur in returned string).
     *
     * examples:
     * 1> A=5 ,B=3 ==> "aabaabab" or "abaabbaa"
     * 2> A=3 ,B=3 ==> "ababab" or "aababb" or "abaabb" or several others.
     * 3> A=1 ,B=4 ==> "bbabb" correct only.
     *
     * Assume
     *      1> A and B within [0...100]
     *      2> at least 1 solution exist for given A and B.
     *
     */
    public static String get(int a,int b) {
        String str="";
        if(a > b) {
            while (a>0 || b>0) {
                if (a>0) {
                    str+="aa";
                    a=a-2;
                }
                if (b>0) {
                    str+="b";
                    b=b-1;
                }
            }
            return str;
        } else {
            while (a>0 || b>0) {
                if (b>0) {
                    str+="bb";
                    b=b-2;
                }
                if (a>0) {
                    str+="a";
                    a=a-1;
                }
            }
            return str;
        }
    }

    public static void main(String[] args) {

        System.out.println(get(5,3));
        System.out.println(get(3,3));
        System.out.println(get(1,4));
    }
}

