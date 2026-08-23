'''
Runtime: 2ms (Beats: 51.57%)
Memory: 19.50MB (Beats: 77.91%)
'''


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if nums1 == [] and nums2 == []:
            return 0.0
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        if len(nums1)%2!=0:
            return float(nums1[int((len(nums1)+1)/2)-1])
        else:
            return float((nums1[int(len(nums1)/2)-1]+nums1[int(len(nums1)/2)])/2)
