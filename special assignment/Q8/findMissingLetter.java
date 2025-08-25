public class findMissingLetter{

    public static char find(char[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1)
                return (char)(arr[i]+1);
        }
        return '\0';
    }

    public static void main(String[] args){
        char[] arr1={'a','b','c','e'};
        char[] arr2={'N','O','P','R'};

        System.out.println("Missing element is: "+find(arr1));
        System.out.println("Missing element is: "+find(arr2));
    }
}