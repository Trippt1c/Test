import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
/*
This file was made by dylan
*/
public class excelReader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] hm = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
