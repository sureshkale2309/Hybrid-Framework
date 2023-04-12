package testRunner;

public class Test {
    public static void main(String args[]){
        String str = "beautiful beach aydut";
        char[] chart = str.toCharArray();
        System.out.println("Orignal String: "+ str);
        System.out.println("Duplicate characters from above string: ");
        for (int i=0; i<str.length();i++){
            for (int j=i+1; j<str.length();j++){
                if (chart[i] == chart[j]){
                    System.out.print(chart[j]+ " ");
                    break;
                }
            }
        }

    }
}
