public class missing_number_in_arrays {


    // brute force approach to find the missing element in array


    // public static void main(String[] args) {
    //     int a[]={1,2,3,4,6,7};
    //     int n =7;
    //     for(int i=1;i<n;i++){
    //         if(a[i-1]!=i){
    //             System.out.println("missing element "+i);
    //             break;
    //         }
    //     }
    // }



    // hashing technique

    // public static void main(String[] args) {
    //     int a[]={1,2,3,4,6,7};
    //     int n =7;
    //     int hash[]=new int [n+1];
    //     for(int i =0;i<a.length;i++){
    //         hash[a[i]] =1;
    //     }

    //     for(int i =1;i<hash.length;i++){
    //         if(hash[i]==0 ){
    //             System.out.println("missing elemnt is "+i);
    //         }
    //     }
    // }



    //optimal solution 

    // public static void main(String[] args) {
    //     int a[]={1,2,3,4,6,7};
    //     int n =7;
    //     int sum1=0;
    //     //sum from 1 to n using formula
    //     int sum2=n*(n+1)/2;
    //     for(int i=0;i<a.length;i++){
    //         sum1+=a[i];   
    //     }

    //     int missing_element =sum2-sum1;
    //     System.out.println(missing_element);
    // }


    //another optimal solution
    //using xor 

    public static void main(String[] args) {
        int a[]={1,2,3,4,6,7};
        int n =7;
        int xor1=0,xor2=0;
        for(int i =0;i<a.length;i++){
            xor1=xor1^a[i];
            xor2=xor2^(i+1);
        }
        xor1=xor1^n;

        int missing_element=xor1^xor2;
        System.out.println(missing_element);

    }
}
