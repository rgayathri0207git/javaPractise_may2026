
import java.util.HashSet;
public class repeatedChar {
    
public static void main(String[] args){

char[] arr = {'a', 'b', 'd','c'};

boolean found=false;
HashSet<Character> set=new HashSet<>();

for(char c:arr){
    if(set.add(c)==false){
        System.out.println("First repeated character is: "+ c);
found=true;
break;
    }
}

for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
      System.out.println("First repeated character is: "+ arr[i]);
found=true;
      break;        }
    }
}
if(found==false){
    System.out.println("No repeated character found.");

}

}




}
