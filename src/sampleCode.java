public class sampleCode {
    public static void main(String[] args) {
        String str="Akash";
        String arr[]= str.split(" ");

        String res="";
        char []charArr;
        for (int i = 0; i < arr.length; i++) {

            charArr= new char[arr[i].length()];
            for (int j = 0; j < charArr.length; j++) {
                charArr[j]=arr[i].charAt(j);
            }


            String s1 = new String(charArr);
//            System.out.println();

            if(res.isEmpty()){
                res=res+s1;
            }else {
                res = String.join(" ", res, s1);
            }
        }
        System.out.println(res);
    }



}
