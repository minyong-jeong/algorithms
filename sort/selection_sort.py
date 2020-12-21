"""
Created by Minyong Jeong on 20.12.21

선택정렬은 정렬되지 않은 부분에서 가장 최소의 값을 찾아 시작부분에 배치하여 정렬하는 알고리즘입니다.
O(n^2)의 시간복잡도를 가지며 알고리즘이 단순하여 메모리가 제한적인 경우에 사용시 성능 상의 이점이 있습니다.

[정렬순서]
1) 주어진 배열에 최소 값을 찾습니다.
2) 그 값을 맨 처음에 위치한 값과 교체합니다.
3) 맨 처음 위치를 제외한 나머지 배열을 같은 방법으로 정렬합니다.
"""

def selection_sort(arr):
    length = len(arr)
    for i in range(length):
        min_idx = i
        for j in range(i+1, length):
            if arr[min_idx] > arr[j]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

if __name__ == "__main__":
    import time
    import random
    total_elements = 1000
    arr = random.sample(range(-50000, 50000), total_elements)

    start = time.time()
    sorted_arr = selection_sort(arr)
    end = time.time()

    print("Total elements:", total_elements)
    print("Success?", sorted_arr == sorted(arr))
    print("Working time: %.2f sec" % (end-start))
