public class Anagrams{

public static void anagrams(String str1,String str2){

String s1 = str1.replaceAll("\\s","").toLowerCase();
String s2 = str2.repaceAll("\\s","").toLowerCase();

boolean status = true;
if(s1.length()!=s2.length()){
status = false;
}
else{

char[] s1Array = s1.toCharArray();

for(char c : s1Array){

int index = s2Array.indexOf(c);
if(index!=-1){

s2 = s2.substring(0,index)+s2.substring(index+1,s2.length());


}else{
status = false;
break;
}


}

}
if(status){
System.out.prinln("two strings are anagrams");
}else{
System.out.println("two strings are not anagrams");

}
}
public static void main(String [] args){
Anagrams.anagrams("peek","keep");

}


}






























