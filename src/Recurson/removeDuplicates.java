package Recurson;

public class removeDuplicates {   //only a to z

    public static void removeDup(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDup(str,idx+1,newstr,map);
        }
        else{
            map[currChar-'a']=true;
            removeDup(str,idx+1,newstr.append(currChar),map );
        }
    }

    public static void main(String[] args) {
        String str="studentcommittee";
        removeDup(str,0,new StringBuilder(""),new boolean[26]);

    }
}
