import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

public class Main{
	private static int[] sorted;
	
	public static void merge_sort(int[] arr) {
		sorted = new int[arr.length];
		merge_sort(arr,0,arr.length-1);
		sorted=null;
	}
	
	private static void merge_sort(int[]arr,int left, int right){
		if(left==right)return;
		int mid=(left+right)/2;
		
		merge_sort(arr,left,mid);
		merge_sort(arr,mid+1,right);
		
		merge(arr,left,mid,right);
	}
	private static void merge(int[] arr , int left,int mid, int right) {
		int L = left;
		int R = mid+1;
		int i = left;
		while(L<=mid&&R<=right) {
			if(arr[L]<=arr[R]) {
				sorted[i]=arr[L];
				i++;
				L++;
			}
			else {
				sorted[i]=arr[R];
				i++;
				R++;
			}
			if(L>mid) {
				while(R<=right) {
					sorted[i]=arr[R];
					i++;
					R++;
				}
			}
			else if(R>right) {
				while(L<=mid) {
					sorted[i]=arr[L];
					i++;
					L++;
			}
		}	
		}
		for(int j=left;j<=right;j++) {
			arr[j]=sorted[j];
		}
	}
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n=Integer.parseInt(br.readLine());
    	int[] arr =new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i]=Integer.parseInt(br.readLine());
    	}
    	merge_sort(arr);
    	for(int i=0;i<n;i++) {
    		bw.write(arr[i]+"\n");
		}
    	bw.flush();
    }
}
