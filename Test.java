import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter digits");
        String getDigits = scanner.nextLine();
        ArrayList digits = new ArrayList();
        ArrayList tens = new ArrayList();
        char[] array = getDigits.toCharArray();
        for (int i=0;i<array.length ; i++) {
            ArrayList list = new ArrayList();
            switch (array[i]) {
                case '2':
                    list.add("A");
                    list.add("B");
                    list.add("C");
                    break;
                case '3':
                    list.add("D");
                    list.add("E");
                    list.add("F");
                    break;
                case '4':
                    list.add("G");
                    list.add("H");
                    list.add("I");
                    break;
                case '5':
                    list.add("J");
                    list.add("K");
                    list.add("L");
                    break;
                case '6':
                    list.add("M");
                    list.add("N");
                    list.add("O");
                    break;
                case '7':
                    list.add("P");
                    list.add("Q");
                    list.add("R");
                    list.add("S");
                    break;
                case '8':
                    list.add("T");
                    list.add("U");
                    list.add("V");
                    break;
                case '9':
                    list.add("W");
                    list.add("X");
                    list.add("Y");
                    list.add("Z");
                    break;
            }
            if (i == 0){
                digits = list;
            }else if (i == 1){
                tens = list;
            }
        }
        if (digits!=null&&digits.size()>0&&tens.size()==0) {
            for (int i = 0; i < digits.size(); i++) {
                System.out.print(digits.get(i) + "  ");
            }
        }
        if (tens!=null&&tens.size()>0&&digits.size()==0) {
            for (int j = 0; j < tens.size(); j++) {
                System.out.print(tens.get(j) + "  ");
            }
        }
        if (digits!=null&&digits.size()>0&&tens!=null&&tens.size()>0) {
            for (int i = 0; i < digits.size(); i++) {
                for (int j = 0; j < tens.size(); j++) {
                    System.out.print(digits.get(i));
                    System.out.print(tens.get(j) + "  ");
                }
            }
        }
    }
}
