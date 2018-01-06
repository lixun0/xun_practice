package practice;


public class STRING{
    private static void con(String[] args) {
        String a = "ababababafab";
        String b = "ab";
        int i = 0;
        while (true) {
            if (a.contains(b)) {
                i++;
                a = a.replaceFirst(b, "");
            } else {
                break;
            }
        }
        System.out.println(i);
    }


    public static void main(String[] args) {
        String str= "ewrtfgtabsjsabduwajewireieiwerieweiierio";
        String str1="ei";
        int count=0;
        int a=0;
        while (str.indexOf(str1,a)>=0&&a<str.length()){
            count++;
            a=str.indexOf(str1,a)+str1.length();
        }
        System.out.print(count);



    }
}

