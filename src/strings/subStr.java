package strings;

public class subStr {
    public static void main(String[] args) {

//        String s="gopi";
        String s="bhakti";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
//        String s="jaishankar";
//        System.out.println(s.substring(4,5));
//        String s="Ragav";
//        System.out.println(s);
//       s="Madav";
//
//        System.out.println(s);
    }
}
