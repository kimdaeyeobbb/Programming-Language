# 배열 처리 모음

## forEach()

- 배열을 처음부터 끝까지 순회하여 내부 인자의 원소 값을 가공한 다음 로직 완성
- <b>기존 배열을 가공 하여도 기존 배열에 영향을 미치지 않음</b>
- 평균, 총합 등을 구할 경우에 사용 

<br>

- 예시 1
```js
let data = [20,30,40,50,60];
let handleddata = [];

data.forEach( val => {
    handleddata.push(val-10)
});

console.log(handleddata); // [ 10, 20, 30, 40, 50 ]
```

<br> 

- 예시 2 
```js
let data = [20,30,40,50,60];
let handleddata = [];

data.forEach((val,idx) => {
    handleddata[idx] = val-10;
});

console.log(handleddata); // [ 10, 20, 30, 40, 50 ]
```



<br>

## map()

- 배열 처음부터 끝까지 순회한 다음 내부 인자의 원소 값을 가공하여 로직을 완성시키는 메서드

<br>

- 예시
```js
let data = [20,30,40,50,60];
let handleddata = data.map(val => {
    return val-10;
});

console.log(handleddata);   // [ 10, 20, 30, 40, 50 ]
```


<br><br>

## filter()

- 주어진 함수의 조건을 통과하는 요소를 모두 모아서 새로운 배열로 반환하는 함수
- 기본꼴
```js
 arr.filter(callback(element[, index[, array]])[, thisArg])
```

- 예시
```js
let data = [
    {name: "kim", age: 20},
    {name: "park", age: 25},
    {name: "lee", age: 30},
    {name: "jang", age: 17},
    {name: "han", age: 19}
];

let handleddata = data.filter(val => {
    return val.age >= 20
});

console.log(handleddata);   
```

<br>

- output
```
[
  { name: 'kim', age: 20 },
  { name: 'park', age: 25 },
  { name: 'lee', age: 30 }
]
```
