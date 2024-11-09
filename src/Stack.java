public class Stack {
    int top=-1;
    private int arr[]=new int[5];
    int size= arr.length;

    public void push(int data){

        if(top<=size)

        arr[++top]=data;
        else{
            System.out.println("stack overflow");
        }

    }
    public int pop(){
        if(top>-1){
        return arr[top--];}
        else {
            System.out.println("Stack is empty");
        }
        return 0;
    }
    public void printstack(){
        for(int n:arr){
            System.out.println(n+"   ");
        }
        System.out.println();
    }

}
