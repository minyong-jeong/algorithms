"""
Created by Minyong Jeong on 20.12.18

삽입정렬은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 자신의 위치를 찾아 삽입함으로써 정렬하는 알고리즘입니다.
O(n^2)의 시간복잡도를 가지지만 선택정렬, 버블정렬 알고리즘에 비해 빠릅니다.
삽입을 할 때 데이터를 하나씩 밀어야 하기 때문에 배열이 길어질수록 효율이 떨어집니다.
"""

def insertion_sort(arr):
    length = len(arr)
    for i in range(length):
        j = i - 1
        key = arr[i]
        while arr[j] > key and j >= 0:
            arr[j+1] = arr[j]
            j = j - 1
        arr[j+1] = key
    return arr

if __name__ == "__main__":
    import time
    import random
    total_elements = 1000
    arr = random.sample(range(-50000, 50000), total_elements)

    start = time.time()
    sorted_arr = insertion_sort(arr)
    end = time.time()

    print("Total elements:", total_elements)
    print("Success?", sorted_arr == sorted(arr))
    print("Working time: %.2f sec" % (end-start))
