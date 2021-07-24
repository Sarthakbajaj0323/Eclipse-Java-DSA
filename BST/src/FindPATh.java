import java.util.ArrayList;
public class FindPATh {
	 public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
	        if(root==null){
	            return null;
	        }
	        if(root.data==data){
	            ArrayList<Integer> output= new ArrayList<Integer>();
	            output.add(root.data);
	            return output;
	        }
	        if(data<root.data){
	            ArrayList<Integer> leftoutput=findPath(root.left,data);
	            if(leftoutput!=null){
	                leftoutput.add(root.data);
	                return leftoutput;
	            }
	        }
	        else if(data>root.data){
	            ArrayList<Integer> rightoutput=findPath(root.right,data);
	            if(rightoutput!=null){
	                rightoutput.add(root.data);
	                return rightoutput;
	            }
	        }
	        else{
	            return null;
	        }
	    return null;
	    }
	    
}
