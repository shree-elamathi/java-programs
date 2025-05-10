
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void main(String[] args) {
        int a[]={1,2,3,-1,-2,-3,1,2,-3};

        //create a nested list to store the answer
        List<List<Integer>> list =new ArrayList();

        //sort the list 
        Arrays.sort(a);
        for(int i =0;i<a.length;i++){

            //if the a[i] is equal to the previous element we need to move to next for we dont do anything just continue 
            if(i>0 && a[i]==a[i-1]){
                continue;
            }

            else{

                //initialize j to next of i
                int j=i+1;

                //initialize k to end element
                int k =a.length-1;
                while(j<k){
                    int sum=a[i]+a[j]+a[k];

                    //if total sum less than 0 then we need to move the j to towards to end since the array is sorted moving towards end 
                    //increases the j value  
                    if(sum>0){
                        k--;
                    }
                    //if total sum greater than 0 then we need to move the k to towards to front since the array is sorted moving towards front 
                    //decreases the k value 
                    else if(sum<0){
                        j++;
                    }
                    
                    //if it is equal to 0 then add the 3 elements to new list and add this list to the original nested list 
                    // then increment the j and decreement the k 
                    // and check if the j and k are not in the same element by using a while loop 
                    // by just doing j<k and a[j]==a[j-1] ----> j++
                    // by just doing j<k and a[k]==a[k+1]----->k--

                    //these two statements are used to check whether the j and k are not in the same elements and both moves to the new element which 
                    // are the previous elements
                    // this two statements are important for this problem
                    

                    else if(sum==0){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(a[i]);
                        temp.add(a[j]);
                        temp.add(a[k]);
                        list.add(temp);
                        j++;
                        k--;
                        while(j<k && a[j]==a[j-1])j++;
                        while(j<k && a[k]==a[k+1])k--;
                    }
                }
        }
        }

        System.out.println(list);

    }
}
