class DynamicArray {
private int []Arr;
private int tos;
private int size;
    public DynamicArray(int capacity) {
    this.size=capacity;
     Arr=new int [capacity];
     tos=-1;
    }

    public int get(int i) {
if (i<0 || i>tos){
    throw new IndexOutOfBoundsException("Index out of bounds ");
}
return Arr[i];
    }

    public void set(int i, int n) {
if (i<0 || i>tos){
    throw new IndexOutOfBoundsException("Index out of bounds ");
}
 Arr[i]=n;
    }

    public void pushback(int n) {
 if(tos+1==size){
    resize();

 }
 Arr[++tos]=n;
    }

    public int popback() {
if (tos==-1){
            throw new IllegalStateException("Array is empty");
        }
        return Arr[tos--];
    }

    private void resize() {
 int newSize = size * 2;
 int []newArr= new int [newSize];

 for(int i=0;i<=tos;i++){
newArr[i]=Arr[i];

 }
 Arr=newArr;
 size=newSize;
    }

    public int getSize() {
return tos+1;
    }

    public int getCapacity() {
return size;
    }
}
