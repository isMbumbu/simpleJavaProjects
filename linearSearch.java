import java.util.Scanner;
public class linearSearch {
    int valueToSearch;
    boolean found=true;
    public static void main(String[] args){
    int[] numbers=new int[10];
    for(int i=0;i<numbers.length;i++){
        numbers[i]=i+1;
    }
    for(int number:numbers){
        System.out.print(number+" ");
    }
    System.out.println(" ");
    linearSearch search=new linearSearch();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Input the integer you want to search for: (must be between 1-10)");
    search.valueToSearch=scanner.nextInt();
    for(int number : numbers){
        if(number == search.valueToSearch){
            search.found=true;
            break;
        }

    }
    if(search.found){
            System.out.println("The digit is in the array");
    }else{
        System.out.println("Invalid value");
    }
        scanner.close();
}
}
