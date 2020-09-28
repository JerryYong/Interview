import io.swagger.models.auth.In;

import java.util.*;
import java.util.regex.Pattern;

public class MiniCode {
    ArrayList digits;
    ArrayList tens;

    public void setDigits(ArrayList digits) {
        this.digits = digits;
    }

    public void setTens(ArrayList tens) {
        this.tens = tens;
    }

    public ArrayList getDigits() {
        return digits;
    }

    public ArrayList getTens() {
        return tens;
    }

    public static void main(String[] args) {
        MiniCode miniCode = new MiniCode();
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[0-9]*");
        System.out.println("Please enter digits");
        String getDigits = scanner.nextLine();
        while (!pattern.matcher(getDigits).matches() || Integer.parseInt(getDigits) > 99) {
            System.out.println("The digits you filled was invalid ,please fill again");
            getDigits = scanner.nextLine();
        }
        char[] array = getDigits.toCharArray();
        for (int i = 0; i < array.length; i++) {
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
            if (i == 0) {
                miniCode.setDigits(list);
            } else if (i == 1) {
                miniCode.setTens(list);
            }
        }

        if ((miniCode.getDigits()!=null&&miniCode.getDigits().size()>0)&&(miniCode.getTens()==null||miniCode.getTens().size()==0)){
            for (int i = 0; i < miniCode.getDigits().size(); i++) {
                System.out.print(miniCode.getDigits().get(i) + "  ");
            }
        }
        if (miniCode.getTens()!=null&&miniCode.getTens().size()>0&&miniCode.getDigits().size()==0) {
            for (int j = 0; j < miniCode.getTens().size(); j++) {
                System.out.print(miniCode.getTens().get(j) + "  ");
            }
        }
        if (miniCode.getDigits()!=null&&miniCode.getDigits().size()>0&&miniCode.getTens()!=null&&miniCode.getTens().size()>0) {
            for (int i = 0; i < miniCode.getDigits().size(); i++) {
                for (int j = 0; j < miniCode.getTens().size(); j++) {
                    System.out.print(miniCode.getDigits().get(i));
                    System.out.print(miniCode.getTens().get(j) + "  ");
                }
            }
        }
    }


}