class Printer <T> {
    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    private T[] t;
    
    public void printArray(T[] t){
    
        this.t= t;
        
        for(int i=0; i<t.length; i++){
            
            System.out.println(t[i]);
        }
     
     
     
 }