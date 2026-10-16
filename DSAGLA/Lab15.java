//package DSAGLA;
//
//
//import java.util.Stack;
//
//public class Lab15 {
//
//    public static void main(String[] args) {
//
//       int arr[]={6,8,0,1,3};
//       int res[]=new int[arr.length];
//       for(int i=0;i<arr.length;i++)
//       {
//           res[i]=-1;
//       }
//       Stack<Integer> st=new Stack<>();
//       for(int i=arr.len gth-1;i>=0;i--)
//       {
//           while(!st.empty()&&st.peek()<=arr[i])
//           {
//               st.pop();
//           }
//           if(!st.empty())
//           {
//               res[i]=st.peek();
//           }
//           st.push(arr[i]);
//       }
//       for(int i=0;i<arr.length;i++)
//       {
//           System.out.println(res[i]);
//       }
//    }
//}
