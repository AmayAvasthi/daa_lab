public class mergeSort
{
public static void merge(int arr[], int beg, int mid, int end)
{
int l = mid - beg + 1;
int r = end - mid;
int LeftArray[] = new int [l];
int RightArray[] = new int [r];
for (int i=0; i<l; ++i)
LeftArray[i] = arr[beg + i];
for (int j=0; j<r; ++j)
RightArray[j] = arr[mid + 1+ j];
int i = 0, j = 0;
int k = beg;
while (i<l && j<r){
if (LeftArray[i] <= RightArray[j]){
arr[k] = LeftArray[i];
i++;
}
else{
arr[k] = RightArray[j];
j++; }
k++;
}
while (i<l){
arr[k] = LeftArray[i];
i++;
k++;}
while (j<r){
arr[k] = RightArray[j];
j++;
k++;
}}
public static void Msort(int arr[], int beg, int end){
if (beg<end)
{
int mid = (beg+end)/2;
Msort(arr, beg, mid);
Msort(arr , mid+1, end);
merge(arr, beg, mid, end);
}}
public static void main(String args[]){
int arr[] = {40,51,22,45,2};
System.out.print("Entered array:");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
Msort(arr, 0, arr.length-1);
System.out.print("Sorted array:");
for(int i =0; i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
}}