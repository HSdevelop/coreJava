package Shildt.chapter3;

public class chapter3 {

    public static void main(String[] args) {
        int[] mas = {0, 1, 2, 3, 4};
        for (int i = 0; i < mas.length; i++) {

            mas[i] = mas[i] + 1;
            System.out.println("mas[i]: " + mas[i]);
            
            int mars;
            int[] n;
            n = new int[2];
            for(int j = 0; j<n.length; j++){
                System.out.println("n[j]"+n[j]);
                n[0]=0;
                n[1]=1;
            }
        }
        String s;
        s = "hello world";
        String l = " HELLO WORLD";
        
        System.out.println(s+l);
    }
    
}
