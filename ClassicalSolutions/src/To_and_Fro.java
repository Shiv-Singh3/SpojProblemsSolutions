import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class To_and_Fro {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int a = Integer.parseInt(bufferedReader.readLine());

            if(a == 0){
                break;
            }
            String b = bufferedReader.readLine();

            ArrayList<ArrayList<Character>> matrix = new ArrayList<ArrayList<Character>>();
            convertToMatrix(matrix, b, a);
            System.out.println(getMessage(matrix));
        }
    }

    private static void convertToMatrix(ArrayList<ArrayList<Character>> matrix, String text, int a){

        int i = 0, length = text.length();
        int rev = 0;
        while(i < length){
            int columnCount = 0;
            ArrayList<Character> arrayList = new ArrayList<Character>();
            while (columnCount < a){
                char ch = text.charAt(i++);
                arrayList.add(ch);
                columnCount++;
            }
            if((rev % 2) == 0){
                matrix.add(arrayList);
            }
            else{
                matrix.add(reverse(arrayList));
            }
            rev++;
        }
    }

    private static String getMessage(ArrayList<ArrayList<Character>> matrix){
        String message = "";
        for(int i = 0;i < matrix.get(0).size();i++){
            for(int j = 0;j < matrix.size();j++){
                message = message + matrix.get(j).get(i);
            }
        }
        return message;
    }

    private static ArrayList<Character> reverse(ArrayList<Character> arrayList){
        ArrayList<Character> arrayList1 = new ArrayList<Character>();
        for(int i = arrayList.size()-1; i >= 0;i--){
            arrayList1.add(arrayList.get(i));
        }
        return arrayList1;
    }
}
