class Stack{
    private int ar[] = {0,1,2,3,4,5,6,7,8,9}; // Only Methods can display/edit it
    void display(){
        String y = "";
        for (int x:ar){
            if (x != -1){
                y += x; y += ' ';
            }
        }
        System.out.println(y);
    }
    void push(int var){
        if (ar[9] == -1){
        for (int i = 9;i >= 0;i--){
            if (ar[0] == -1){
                    ar[0] = var;
                    return;
                }   
            if (ar[i] != -1){
                ar[i + 1] = var;
                return;
                }  
            }
        }
        else{
            display();
            System.out.println("^^^ Array Full");
        }
    }
    void pop(){
        if (ar[0] != -1){
            for (int i = 9;i >= 0;i--){
                if (ar[i] != -1){
                    ar[i] = -1;
                    return;
                }
            }
        }
        else{
            System.out.println("Array Empty");
        }
    }
    private int[] Ret(){          // It is private but can be used by the class
        return ar;
    }

    void Compare(Stack ob){
        int arr[] = new int [10];
        int arr2[] = new int [10];
        arr = Ret();
        arr2 = ob.Ret();                                              // Usage of private
        if (arr[0] == arr2[0]) System.out.println("ar[0] are the same");
    }
}

class Create{
    Stack create(){
        return new Stack();
    }
}

class OOP2 {
    public static void main(String args[]){
        Stack d = new Stack();
        d.display();
        // removes 11 numbers
        for (int i = 0;i < 11;i++){
            d.pop();
        }
        d.display();
        // adds 11 numbers 
        for (int i = 0;i < 11;i++){
            d.push(i);
        }
        d.display(); 

        Stack a = new Stack();

        d.Compare(a);

        //creating a new object from a class returning an object

        Create c = new Create();    // class is initialized
        Stack stack = c.create();   // stack is assigned the object

        // displaying new stack object made

        stack.display();
    }
}