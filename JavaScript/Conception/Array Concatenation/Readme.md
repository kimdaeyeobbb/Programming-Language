# 배열 합치기

## 1) concat() 사용

- 사용 예시<br>(concat 이용하여 원본 배열인 arr1,arr2,arr3의 내용을 변경하지 않고 합쳐진 배열을 return)

```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = arr1.concat(arr2,arr3);

console.log(arr4);
```

<br>

- Output
```
[
  '가', '나', '다',
  'a',  'b',  'c',
  1,    2,    3
]
```


### cf) concat 사용


- 방법 1
```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = arr1.concat(arr2);

console.log(arr4);   // [ '가', '나', '다', 'a', 'b', 'c' ]
```

- 방법 2
```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = [].concat(arr3,arr2);

console.log(arr4);   //   [ 1, 2, 3, 'a', 'b', 'c' ]
```


<br><br>


## 2) Spread operator 사용

- 사용 예시
```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = [
    ...arr1,
    ...arr2,
    ...arr3
];

console.log(arr4);
```

<br>

- Output
```
[
  '가', '나', '다',
  'a',  'b',  'c',
  1,    2,    3
]
```

<br><br>


## 3) push() 사용

- 사용 예시

```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = [];
arr4.push(...arr1,...arr2,...arr3);
console.log(arr4);  
```

- Output
```
[
  '가', '나', '다',
  'a',  'b',  'c',
  1,    2,    3
]
```

- cf) Spread operator 미사용시 
```js
const arr1 = ['가','나','다'];
const arr2 = ['a','b','c'];
const arr3 = [1,2,3];

const arr4 = [];
arr4.push(arr1,arr2,arr3);
console.log(arr4);
```


- output
```
[ [ '가', '나', '다' ], [ 'a', 'b', 'c' ], [ 1, 2, 3 ] ]
```






