import java.util.ArrayList;
import java.util.Collections;
public class Pair_sum_Bimary_Tree {
    public static void converttoarray(BinaryTreeNode<Integer> root, ArrayList<Integer> output){
        if(root==null)
            return;

        output.add(root.data);
        converttoarray(root.left,output);
        converttoarray(root.right,output);
    }

    public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
        ArrayList<Integer> output=new ArrayList<Integer>();
        converttoarray(root,output);

        Collections.sort(output);
        int i =0;
        int j=output.size()-1;
        while(i<j){
            if(output.get(i)+output.get(j)==sum){
                //if duplicate elements are present
                int countI=1;
                int countJ=1;
                int k=i+1;
                //count the no of of times 1 st element is present
                while(output.get(i)==output.get(k)){
                    countI++;
                    k++;
                    }
                k=j-1;
                //count the the no of times 2 nd element s present
                while(output.get(j)==output.get(k)){
                    k--;
                    countJ++;
                }
                //print the the total pairs of element
                int count=countI*countJ;
                while(count>0){
                    System.out.println(output.get(i)+" "+output.get(j));
                    count--;
                }
				i+=countI;
                j-=countJ;
            }
            else if(output.get(i)+output.get(j)>sum){
                j--;
            }
            else{
                i++;
            }
        }
    }

}
