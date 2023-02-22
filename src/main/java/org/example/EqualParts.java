package org.example;

import java.util.ArrayList;

public class EqualParts {
    public static ArrayList<Integer> split(int num, int parts){
        ArrayList<Integer> answer = new ArrayList<Integer>(parts);
        int remainder = num%parts;
        int firstDivision = num/parts;
        int secondDivision = (num/parts)+1;
        for (int i = 0; i < parts-remainder; i++) {
            answer.add(firstDivision);
        }
        for( int j = parts-remainder; j<parts; j++){
            answer.add(secondDivision);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(split(10,5));
    }
}
