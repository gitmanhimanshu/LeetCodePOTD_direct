class Solution:
    def processStr(self, s: str, k: int) -> str:
        n = len(s)
        lens = [0] * (n + 1)

        for i, ch in enumerate(s):
            cur = lens[i]

            if ch == '*':
                lens[i + 1] = max(0, cur - 1)

            elif ch == '#':
                lens[i + 1] = cur * 2

            elif ch == '%':
                lens[i + 1] = cur

            else:
                lens[i + 1] = cur + 1

        if k >= lens[n]:
            return '.'

        for i in range(n - 1, -1, -1):
            ch = s[i]
            prev = lens[i]
            cur = lens[i + 1]

            if ch == '#':
                if k >= prev:
                    k -= prev

            elif ch == '%':
                k = cur - 1 - k

            elif ch == '*':
                pass

            else:
                if k == prev:
                    return ch

        return '.'