def check_data_types(n):
    result = []
    if -128 <= n <= 127:
        result.append("byte")
    if -32768 <= n <= 32767:
        result.append("short")
    if -2147483648 <= n <= 2147483647:
        result.append("int")
    if -9223372036854775808 <= n <= 9223372036854775807:
        result.append("long")
    return result

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    T = int(data[0])
    results = []
    
    for i in range(1, T + 1):
        n = int(data[i])
        data_types = check_data_types(n)
        if data_types:
            results.append(f"{n} can be fitted in:")
            for dtype in data_types:
                results.append(f"* {dtype}")
        else:
            results.append(f"{n} can't be fitted anywhere.")
    
    print("\n".join(results))

if __name__ == "__main__":
    main()
