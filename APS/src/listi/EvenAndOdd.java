package listi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        SLL<Integer> list = new SLL<>();
        for(int i=0; i<n; i++){
            String lala = br.readLine();
            int k = Integer.parseInt(lala);
            list.insertLast(k);
        }
        int j=0;
        SLLNode<Integer> tmp = list.getFirst();
        while(j!=n){
            if(tmp.element%2!=0){ //neparen samo stavi go na kraj
                list.insertLast(tmp.element);
                list.delete(tmp);
            }
            tmp = tmp.succ;
            j++;
        }
        System.out.println(list.toString());
    }
}
