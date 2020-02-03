/*
    26. Remove Duplicates from Sorted Array (Easy)
    Approach: Two Pointers
*/
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.size() == 0) return 0;
        int pre = nums[0];
        int resultLen = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (pre != nums[i]) {
                pre = nums[i];
                nums[resultLen++] = nums[i];
            }
        }
        return resultLen;
    }
};