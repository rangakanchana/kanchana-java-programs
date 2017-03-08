public class RemoveSpaces{

public static void remWhiteSpaces(String str){

String s=str.replaceAll("\\s","");
System.out.println(s);
}
public static void removeWhSpaces(String str){
	
	char[] toArray=str.toCharArray();
	
	StringBuffer sb = new StringBuffer();
	for(int i=0;i<toArray.length;i++){
	if(toArray[i]!=' '){
		
		sb.append(toArray[i]);
	}	
	}
	System.out.println(sb);
}
public static void main(String []args){
//RemoveSpaces.remWhiteSpaces("java is a best language");
RemoveSpaces.removeWhSpaces("ka ha   ani");

}

}