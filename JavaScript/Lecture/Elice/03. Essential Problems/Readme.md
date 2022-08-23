# 자바스크립트 필수 문제집

## 따옴표 출력하기

- ```\ (역슬래시)```를 따옴표 앞에 적어줄 경우 해당 따옴표를 문자열내에 표시할 수 있음

- 예시
```js
console.log("\"It's all right.\"");   // "It's all right."
console.log('"It\'s all right."');   // "It's all right."

function solution(){
    return '"It\'s all right."';
}

console.log(solution());   //  "It's all right."
```

<br>

## 함수 내에서 함수 호출하기

- 함수 안에서 함수를 리턴하는 경우, 리턴되는 함수는 호출하지 않고 함수명만 적을 것 <br><BR>
함수    (O)<BR>
함수()  (X)<BR>

<br>  
  
- 예시
```js
function solution(){
    function add(x,y){
        return x+y;
    }
    return add;   // return value -> [Function: add]
// return add() 꼴로 쓰면 안됨 -> add()는 add함수 return 결과를 solution 함수에 return하는 셈임
}  
```

<br>
  
  
## N줄 입력받기

-
