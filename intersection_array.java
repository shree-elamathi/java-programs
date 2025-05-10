
import java.util.ArrayList;

public class intersection_array {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6,7};
        int a2[]={1,2,5,6,7,8,9};
        ArrayList<Integer> Intersection = new ArrayList<>();

        int i =0;
        int j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                i++;
            }

            else if(a1[i]>a2[j]){
                j++;
            }

            else{
                Intersection.add(a1[i]);
                i++;
                j++;
            }
        }
        System.out.println(Intersection);
    }
}
