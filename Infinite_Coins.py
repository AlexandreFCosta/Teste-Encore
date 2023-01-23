def makeChange(n):
    coins = [25, 10, 5, 1]
    result = []
    def helper(n, index, current):
        if n == 0:
            result.append(list(current))
            return
        if n < 0 or index >= len(coins):
            return
        for i in range(n // coins[index] + 1):
            current[index] = i
            helper(n - i * coins[index], index + 1, current)
    helper(n, 0, [0, 0, 0, 0])
    print(result)
    return result



makeChange(15)
