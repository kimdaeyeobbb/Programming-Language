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

- JS에서는 ```\n```를 통해 줄바꿈을 함
- 따라서 JS 기본 메서드인 ```split```을 통해 ```\n```을 구분함
- ```split```메서드는 주어진 인자를 기준으로 원소들을 나누어 배열로 반환함

- 예시 1
```js
const arr1 = "manchesterlivunited".split("liv");   // liv를 기준으로 원소를 나누어 배열로 return
console.log(arr1);  //  [ 'manchester', 'united' ]
```

<br><br>

## 조건에 맞는 암호

![image](https://user-images.githubusercontent.com/68424403/186074656-6c28ee33-9ffd-47c0-a6da-2a577e70c2ba.png)

<br><br>




## 노동요

![image](https://user-images.githubusercontent.com/68424403/186075053-b9fc65cc-9af6-41ff-91fe-35edcf3d87d8.png)


<br><br>

## 소수의 합 구하기

![image](https://user-images.githubusercontent.com/68424403/186075144-8a563d32-4109-4ecc-a500-3fa455c5043c.png)

<br>

![image](https://user-images.githubusercontent.com/68424403/186075264-608e6d6e-38bf-446d-b137-d651be5f7657.png)



<br><br>

## 중첩된 배열을 펼치기

![image](https://user-images.githubusercontent.com/68424403/186075342-827ebbb3-7cfa-4b97-b3b9-39fb04673190.png)

<br>

![image](https://user-images.githubusercontent.com/68424403/186075520-3b84f3ec-508f-4514-a480-9b14a9b1c0a2.png)



<br><br>
