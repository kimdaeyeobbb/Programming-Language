# Programming-Language

<br>

## Python 

### :heavy_check_mark: How to get multiline input from user - The number of inputs is not determined

<br>



#### :one: 
```python
wordlist = list()
while sys.stdin.readline():
  wordlist.append(sys.stdin.readline())
```

#### :two: 
```python
wordlist = list()
for line in sys.stdin:
  wordlist.append(line)
```

#### :three: 
```python
wordlist = []
while True:
  words = sys.stdin.readline().strip()
  if not words:
    break
   wordlist.append(words)
```
