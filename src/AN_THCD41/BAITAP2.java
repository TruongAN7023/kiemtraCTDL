package AN_THCD41;

public class BAITAP2 {
	// a. Đếm số lượng phần tử chẵn trong mảng
	public static int countEvenElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
            return count;
        }
            // b. Kiểm tra mảng có được sắp xếp tăng dần hay không
            public static boolean isSorted(int[] arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        return false;
                    }
                }
                return true;
            }
            // c. Đếm số lượng phần tử có giá trị từ 4 đến 12 trong mảng
            public static int countElementsBetween4And12(int[] arr) {
                int count = 0;
                for (int num : arr) {
                    if (num >= 4 && num <= 12) {
                        count++;
                    }
                }
                return count;
            }
         // d. Tính tổng các phần tử của mảng
            public static int sumOfElements(int[] arr) {
                int sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                return sum;
            }
            // e. Tính tổng các phần tử có giá trị lẻ
            public static int sumOfOddElements(int[] arr) {
                int sum = 0;
                for (int num : arr) {
                    if (num % 2 != 0) {
                        sum += num;
                    }
                }
                return sum;
            }
      
            // g. Tìm giá trị lớn nhất của mảng
            public static int findMaxValue(int[] arr) {
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;
            }

            public static void main(String[] args) {
                // Ví dụ sử dụng các hàm đã viết:
                int[] array = {3, 8, 2, 5, 10, 7, 12, 4, 9, 6};

                // a. Đếm số lượng phần tử chẵn trong mảng
                System.out.println("Số lượng phần tử chẵn trong mảng: " + countEvenElements(array));

                // b. Kiểm tra mảng có được sắp xếp tăng dần hay không
                System.out.println("Mảng được sắp xếp tăng dần? " + isSorted(array));

                // c. Đếm số lượng phần tử có giá trị từ 4 đến 12 trong mảng
                System.out.println("Số lượng phần tử có giá trị từ 4 đến 12: " + countElementsBetween4And12(array));
             // d. Tính tổng các phần tử của mảng
                System.out.println("Tổng các phần tử của mảng: " + sumOfElements(array));

                // e. Tính tổng các phần tử có giá trị lẻ
                System.out.println("Tổng các phần tử có giá trị lẻ: " + sumOfOddElements(array));

                Object arr;
				

       
            

            }


        

}


