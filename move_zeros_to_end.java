
import java.util.Arrays;


/*  move the zeros to the end of the array
input array [1,2,0,0,3,0,4,5]
output array [1, 2, 3, 4, 5, 0, 0, 0]
*/

//naive solution

/* 
class move_zeros_to_end{
        public static void main(String[] args) {
            int [] a={1,2,0,0,3,0,4,5};
            int count=0;
            for(int i=0;i<a.length;i++){
                if(a[i]!=0){
                    count++;
                }
            }
            int temp []=new int [count];
            for(int i=0,k=0;i<a.length;i++){
                if(a[i]!=0){
                    temp[k]=a[i];
                    k++;
                }
            }

            for(int i=0;i<temp.length;i++){
                a[i]=temp[i];
            }

            for(int i=count;i<a.length;i++){
                a[i]=0;
            }

            System.err.println(Arrays.toString(a));
        }
}  
        */


//optimal solution with 2 pointer within a single loop

class move_zeros_to_end{
    public static void main(String[] args) {
        int a[]={1,2,0,0,3,0,7,0,4,5};
        int j=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        for(int i =j+1;i<a.length;i++){
            if(a[i]!=0){
                a[j]=a[j]+a[i];
                a[i]=a[j]-a[i];
                a[j]=a[j]-a[i];
                j++;
            }
        }
        System.err.println(Arrays.toString(a));
    }
}
