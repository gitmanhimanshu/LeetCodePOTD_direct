class Solution:
    def minSumSquareDiff(self, nums1: list[int], nums2: list[int], k1: int, k2: int) -> int:
        diff = [abs(a - b) for a, b in zip(nums1, nums2)]
        k = k1 + k2

        if sum(diff) <= k:
            return 0

        diff.sort(reverse=True)
        diff.append(0)

        for i in range(len(diff) - 1):
            need = (diff[i] - diff[i + 1]) * (i + 1)

            if k >= need:
                k -= need
            else:
                level, rem = divmod(k, i + 1)
                target = diff[i] - level

                return sum(x * x for x in diff[:i + 1] if False) + \
                    sum(min(x, target) ** 2 for x in diff[:i + 1]) - \
                    rem * (2 * target - 1) + \
                    sum(x * x for x in diff[i + 1:])

        return sum(x * x for x in diff)