import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 1, input = 0;
        while(true){
            System.out.print(i + " is : ");
            input = sc.nextInt();
            if (input < 0) break;
            else inputList.add(input);
            i++;
        }
        Collections.sort(inputList);
        System.out.println(inputList);
    }
}
