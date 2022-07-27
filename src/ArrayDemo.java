import java.util.*;
class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customerCount = scan.nextInt();
        String names[] = new String[customerCount];
        int items[] = new int[customerCount];
        int prices[] = new int[customerCount];
        scan.nextLine();
        for(int i=0;i<names.length;i++){
            System.out.println("Enter name");
            names[i] = scan.nextLine();
            System.out.println("Enter number of Items");
            items[i]=  scan.nextInt();
            for(int j=0;j<items[i];j++){
                System.out.println("Enter price of item");
                 prices[i] += scan.nextInt();
            }
        }
        System.out.println("Name"+'\t'+"Total"+'\n');
        for(int i=0;i<customerCount;i++){
           System.out.println(names[i]+'\t'+prices[i]);
        }
    }
}
