"""
Created by Minyong Jeong on 20.12.18

버블소트는 인접한 요소들을 비교하여 정렬하는 알고리즘입니다.
O(n^2)의 시간복잡도를 가지지만 코드가 단순하여 자주 사용됩니다.
"""

def bubble_sort(arr):
    length = len(arr)
    for i in range(length-1):
        for j in range(length-1-i):
            if arr[j] > arr[j+1]:
                tmp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = tmp
    return arr

if __name__ == "__main__":
    import time
    import random
    total_elements = 1000
    arr = random.sample(range(-50000, 50000), total_elements)

    start = time.time()
    sorted_arr = bubble_sort(arr)
    end = time.time()

    print("Total elements:", total_elements)
    print("Success?", sorted_arr == sorted(arr))
    print("Working time: %.2f sec" % (end-start))
