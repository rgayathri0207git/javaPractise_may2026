

public static void main (String[] args){

char[] arr={'a','b','a','b','c','c'};

boolean flag=false;
for (int i=0;i<arr.length;i++){
    int count=0;
    for(int j=0;j<arr.length;j++){
if (arr[i]==arr[j]&&i!=j){
    count = count+1;
    break;
}
    }
    if(count==0){
        System.out.println(arr[i]);
        flag=true;
        break;
    }
}
if(!flag){
    System.out.println("No non-repeated character found");
}

}
