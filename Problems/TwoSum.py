''' Runtime: 4ms (Beats 42.08%)
  Memory: 20.71MB (Beats 6.95%) 
  Decided to use python for some problems
  '''

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map ={}
        for i in range(0,len(nums)):
            if f"{target-nums[i]}" in map:
                return [i,map[f"{target-nums[i]}"]]
            else:
                map.update({f"{nums[i]}":i})

        return []
