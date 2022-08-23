# 제어문 

## 자바스크립트 활용

### 소수 출력하기
```js
function isPrime(n){
    var divisor = 2;   // 2부터 나누기 시작
    while (n > divisor){   // n이 나누는 수보다 클 때까지
        if (n%divisor === 0){   // n과 나누는 수가 나누어 떨어지는 경우
            return false;
        } else {   // 나누어 떨어지지 않는다면
            divisor++;   // 나누는 수를 1 증가시킴
        }
    }
    return true;
}

/* 출력 */
for (var i=1; i<=10; i++){
  document.writeln(i, isPrime(i));
}
```

<br><br>

### 문자열 거꾸로 출력하기
```js
function reverse(str){
    var reverStr = '';   // 빈 문자열
    for (var i = str.length-1; i>=0; i--){
        reverStr = reverStr + str.charAt(i);
    }

    return reverStr;
}

console.log(reverse('Hello'));   // olleH
```
