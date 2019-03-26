package scanner;


import static java.lang.System.out;

	public class CalculateTn {

	    public static void main(String[] args) {

	        Vector<String> v = new Vector<String>();
	        v.print();
	        v.add("jason");
	        v.add("test");
	        v.add("bob"); // index 2
	        v.add("vania");
	        
	        v.print();
	        
	        v.deleteIndex(2);
	        v.deleteIndex(2);
	        v.deleteIndex(2);

	        v.print();
	        v.debugPrint();
	        

	    }

	    public static class Vector<T> {
	        private T[] arr;
	        private int vectorSize;

	        public Vector() {
	            arr = (T[]) new Object[5];
	            vectorSize = 0;
	        }

	        public void add(T i) {
	            if (vectorSize == arr.length) {
	                T[] newArray= (T[])new Object[arr.length*2];
	                for (int n = 0 ; n < arr.length ; n++ ) {
	                    newArray[n] = arr[n];
	                }
	                arr = newArray;
	                // C++ delete (arr)
	            }
	            arr[vectorSize] = i;
	            vectorSize++;
	        }
	        
	        public void deleteIndex(int index) {
	            
	            for (int n = index ; n < vectorSize-1 ; n++) {
	                arr[n] = arr[n+1];
	            }
	            vectorSize = vectorSize - 1;
	        }
	        
	        
	        public T get(int index) {
	            return arr[index];
	        }
	        
	        public void print() {
	            out.print("[");
	            for (int x = 0; x < vectorSize; x++) {
	                out.print(arr[x] + ", ");
	            }
	            out.println("]");
	        }
	        
	        public void debugPrint() {
	            out.print("vectorSize=" + vectorSize);
	            out.print("[");
	            for (int x = 0; x < arr.length; x++) {
	                out.print(arr[x] + ", ");
	            }
	            out.println("]");
	        }

	        
	    }
	}


