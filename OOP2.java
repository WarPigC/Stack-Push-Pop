class Stack{
    private int ar[] = {0,1,2,3,4,5,6,7,8,9}; 
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
}

class OOP2 {
    public static void main(String args[]){
        Stack d = new Stack();
        d.display();
        // removes 10 numbers
        for (int i = 0;i < 10;i++){     
            d.pop();
        }
        d.display();
        // adds 10 numbers 
        for (int i = 0;i < 10;i++){     
            d.push(i);
        }
        d.display(); 
    }
}
