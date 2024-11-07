public class pattern2 {
    public static void main(String[] args){
        System.out.print("Hello there! We will print some of the most basic patterns in Java");
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
