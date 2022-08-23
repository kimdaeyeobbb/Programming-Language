# 2차원 배열을 1차원 배열로 변환하기 

## 1) reduce & concat 사용

### reduce()


- 배열의 첫번재 요소부터 마지막 요소까지 순회하며 연산을 수행하고, 누적된 객체 하나를 리턴하는 함수

<br>

### arr1.concat(arr2)


- arr1 배열 요소와 arr2 배열 요소를 모두 합쳐 하나의 배열로 리턴하는 함수

<br><br>

### 사용 예시

```js
const arr = [['a','b'],['c','d'],['e','f']];   // 2차원 배열
const arr2 = ['a','b','c','d','e','f'];   // 1차원 배열

/* reduce: 배열의 첫번째 요소부터 마지막 요소까지 순회하며 연산 수행 후 누적된 객체 하나를 리턴 */
const arr3 = arr.reduce(function(acc,cur){
    return acc.concat(cur);   // concat: 요소를 1차원 배열로 만듦
});

console.log(arr3);   // [ 'a', 'b', 'c', 'd', 'e', 'f' ]

```

<br><br>

## 2) reduce & Spread operator 사용

### Spread operator 

- ```...```와 같이 배열의 요소들을 나열하는 전개 연산자


- 사용 예시

```js
const arr = [['a', 'b'], ['c', 'd'], ['e', 'f']];

const arr2 = arr.reduce(function (acc, cur) {
  return [...acc, ...cur];
});

console.log(arr2);

```


<br><br>


## 3) forEach 사용

- 사용 예시
```js
const arr = [['a', 'b'], ['c', 'd'], ['e', 'f']];

let arr2 = [];
arr.forEach((element) => {
  arr2 = arr2.concat(element);
})

console.log(arr2);   // [ 'a', 'b', 'c', 'd', 'e', 'f' ]
```


- ```forEach()```와 ```concat()```을 이용하여 배열의 모든 요소를 순회하면서 1차원 배열로 변환함

<br><br>


## 4) forEach & Spread Operator 사용

- 사용 예시
```js
const arr = [['a', 'b'], ['c', 'd'], ['e', 'f']];

let arr2 = [];
arr.forEach((element) => {
  arr2 = [...arr2, ...element];
})

console.log(arr2);  // [ 'a', 'b', 'c', 'd', 'e', 'f' ]
```

<br><br>

## 5) flat() 사용

- 기본 꼴
```js
const newArr = arr.flat([depth])
```

- ```depth```: 중첩 구조를 평탄화 할 때 사용 (기본값은 1)


- return value: 하위 배열을 이어붙인 새로운 배열

- 사용 예시
```js
const arr1 = [1, 2, [3, 4]];
arr1.flat();    // [1, 2, 3, 4]

const arr2 = [1, 2, [3, 4, [5, 6]]];
arr2.flat();   // [1, 2, 3, 4, [5, 6]]

const arr3 = [1, 2, [3, 4, [5, 6]]];
arr3.flat(2);   // [1, 2, 3, 4, 5, 6]

const arr4 = [1, 2, [3, 4, [5, 6, [7, 8, [9, 10]]]]];
arr4.flat(Infinity);   // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

### 📑 ref

- [flat() 참고자료](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array/flat)

