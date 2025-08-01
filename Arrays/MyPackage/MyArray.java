package MyPackage;

public class MyArray {
    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize){
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int value){

        if(currentIndex == items.length){
            int[] temp = new int[items.length * 2];

            for(int i= 0;i<this.currentIndex;i++){
                temp[i] = items[i];

            }
            items=temp;//now my items will point at out new array

        }


        this.items[currentIndex] = value;
        this.currentIndex++;
    }

    public String toString(){
        // String str = new String();
        // for(int num: this.items){
        //     str = str + (num+", ");
        // }
        // return str;

        StringBuilder str = new StringBuilder();
        str.append("[");

        for(int i=0;i<this.currentIndex;i++){
            str.append(this.items[i]+" ");
        }
        str.append("\b").append("]");
        return str.toString();   //here str is a object and not a string, hence we cannot directly return it. We have to do str.toString() so that the function returns a string.
    }

    public int indexOf(int value){
        //linear search
        // for(int i=0;i < this.items.length;i++){
        //     if(this.items[i]==value) return i;

        // }
        //rather than the upper loop we can optimize it a little 
        for(int i=0;i < this.currentIndex;i++){
            if(this.items[i]==value) return i;

        }
        return -1;
    }


    public void removeAt(int index){

        if(index >= this.currentIndex) throw new IllegalArgumentException();

        for(int i=index;i<(this.currentIndex-1);i++){
            this.items[i]=this.items[i+1];
            
        }
        
        this.currentIndex--;
        this.items[this.currentIndex]=0;

    }

    public int max(){
        int result = this.items[0];

        for(int i=1;i<this.currentIndex;i++){
            if(items[i]>result){
                result=items[i];
            }
        }
        return result;
    }

    public int min(){
        int result = this.items[0];

        for(int i=1;i<this.currentIndex;i++){
            if(items[i]<result){
                result = items[i];
            }
        }
        return result; 
    }

    public void reverse(){
        int i = 0;
        int j = this.currentIndex-1;

        while(i<j){
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            i++;
            j--;
        }


    }
}
