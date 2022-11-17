package Study;
class Bubble {
	   static void swap(int[] a, int idx1, int idx2) {
	      int t = a[idx1];
	      a[idx1] = a[idx2];
	      a[idx2] = t;
	   }
	   static void bubble(int[] a, int n) {
	      int ccnt = 0;
	      int scnt = 0;
	      for (int i = 0; i < n-1; i++) {
	         System.out.println("패스" + (i+1) + " : ");
	         for (int j = n-1; j > i; j--) {
	            for (int m = 0; m < n-1; m++) {
	               String tmp = String.format("%3d ", a[m]);
	               
	               if (m != j-1) {
	                  tmp = tmp + " ";
	               } else {
	                  if (a[j-1] > a[j]) {
	                     tmp = tmp + "+";
	                  } else {
	                     tmp = tmp + "-";
	                  }
	               }
	               System.out.print(tmp);
	            }
	            System.out.printf("%3d\n", a[n-1]);
	            
	            ccnt++;
	            if (a[j-1] > a[j]) {
	               scnt++;
	               swap(a, j-1, j);
	            }
	         }
	         for (int m = 0; m < n; m++)
	            System.out.printf("%3d  ", a[m]);
	         System.out.println();
	      }
	   }
	   static void print(int[] a, int n) {
	      for (int i = 0; i < n; i++) {
	         System.out.println("x[" + i + "]=" + a[i]);
	      }
	   }
	}
	public class BubbleSort {
	   public static void main(String[] args) {
	      int nx = 8;
	      int[] x = {7,6,4,3,7,1,9,8};

	      Bubble.bubble(x, nx);
	   }
	}